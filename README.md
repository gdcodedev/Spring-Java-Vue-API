
# About
Spring + Java + Vue + API

Linguagem de Backend - Java
Framework utilizado - Spring boot

Linguagem de Frontend - JavaScript
Framework utilizado - VueJS





## API Reference

#### Get all items

```http
  GET /api/clientes
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/atividades/${atividadeId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### User Spring Security = User password = 252635698




## Features

- Habilitado CORS para requisição
- SQL do banco gerado para testes.



## Authors

- [@gdcodedev](https://www.github.com/gdcodedev)


## Deployment Front e Backend

Para execução do backend pode ser utilizado a própria IDE

Para execução do projeto vue

```bash
  npm run server
```


## Estrutura do Projeto

- Criação e estrutura das Entities
- Criação do Banco Postgres
- Criação do Front utilizando VueJS
- Configuração do Axios para requisição
- Configuração do Cors
- Finalização do projeto

- Itens faltantes 

- Botão de edição e exclusão.
- Estilização da Home



## Running Tests

To run tests, run the following command

```bash
  npm run test
```

