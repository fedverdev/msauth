# Сервис авторизации (ms-auth)

Простой сервис авторизации и аутентификации, реализованный на **Java 21** с использованием **Spring Boot**, **Spring Security** и **JWT**.  
Предназначен для управления пользовательскими сессиями с возможностью инвалидации токенов через blacklist.

## Оглавление

todo

## Основные возможности

- **Регистрация пользователя**  
  `/register` – принимает логин и пароль, сохраняет учётную запись в системе.

- **Вход в систему**  
  `/login` – проверяет переданные креды, выдаёт пару **access** и **refresh** токенов (JWT).

- **Выход из системы**  
  `/logout` – аннулирует текущие токены, добавляя их **jti** (JWT ID) в blacklist. Последующие запросы с этими токенами будут отклонены.

- **Ротация access‑токена**  
  `/refresh` – принимает валидный refresh‑токен, выдаёт новый access‑токен (и опционально обновляет refresh).

## Диаграммы

### Регистрация пользователя
```mermaid
sequenceDiagram
    participant Client as Клиент
    participant Auth as ms-auth
    participant DB

    Client->>Auth: POST /api/v1/register {credentials}
    activate Auth
    Auth->>Auth: Валидирует {credentials}
    alt {credentials} не валидны
    Auth-->>Client: Возвращает 400: неверный формат
    else {credentials} валидны
        Auth->>Auth: Хэширует пароль (bcrypt)
        Auth->>DB: INSERT INTO users (login, password) VALUES (?, ?)
        activate DB
        alt duplicate key error (login занят)
            DB-->>Auth: Ошибка дубликата
            Auth-->>Client: 409: login занят
        else Другие ошибки БД
            DB -->> Auth: Ошибка БД
            Auth -->> Client: 500: Внутренняя ошибка сервиса
        else вставка успешна
            Auth-->>Client: 201: пользователь зарегистрирован
        end
        deactivate DB
    end
    deactivate Auth
```

## Стэк

todo

## Установка

todo
