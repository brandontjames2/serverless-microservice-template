CREATE TYPE USER_TYPE AS ENUM ('INTERNAL', 'EXTERNAL');

create table APP_USER
(
    ID         UUID         not null,
    VERSION    BIGINT       not null,
    FIRST_NAME VARCHAR(255) not null,
    LAST_NAME  VARCHAR(255) not null,
    USER_TYPE  USER_TYPE    not null,
    EMAIL      VARCHAR(255) not null,
    IS_ACTIVE  BOOLEAN      not null,
    CREATED_AT TIMESTAMP    not null,
    UPDATED_AT TIMESTAMP    not null,
    CREATED_BY UUID         not null,
    UPDATED_BY UUID         not null,
    PRIMARY KEY (ID)
);