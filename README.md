**IMPP-API**
----


### EXECUÇÃO

O banco de dados ```MySQL 8``` está configurado para rodar em um container docker, que foi definido no arquivo  ```stack.yml``` então para subir o container basta ter a docker instalada e rodar o comando:

```docker-compose -f stack.yml up```

Para rodar o programa, basta instalar as dependências ```Maven``` e inicia-lo como uma aplicação SPRING.

### URL

O serviço, como previamente definido roda na porta :8080 sendo assim ficando com o url base:
http://localhost:8080


### Formato

O formato esperado de um produto é o seguinte:

```javascript
  [
    {
        "date": "17/09/2021",
        "user": {
            "id": 1,
            "name": "João"
        }
    },
    {
        "date": "17/09/2021",
        "user": {
            "id": 1,
            "name": "João"
        }
    },
        {
        "date": "17/09/2021",
        "user": {
            "id": 1,
            "name": "João"
            }
        }
  ]
```


### Endpoints

São disponibilizados os seguintes endpoints:


| Verbo HTTP  |  Resource path    |          descrição           |
|-------------|:-----------------:|------------------------------:|
| GET         |  /im-day/   |   Busca todos os dias e usuários   |
| GET         |  /docs        |   Leva para a documentação da api com Swagger           |


#### GET /im-day

Nesse endpoint a API retorna a lista atual de datas com até 120 dias a frente com HTTP 200. Se não existir dias, retornar uma lista vazia.

Retorno com a lista:
```javascript
  [
    {
        "date": "17/09/2021",
        "user": {
            "id": 1,
            "name": "João"
        }
    },
    {
        "date": "17/09/2021",
        "user": {
            "id": 1,
            "name": "João"
        }
    },
    {
        "date": "17/09/2021",
        "user": {
            "id": 1,
            "name": "João"
        }
    }
]
```