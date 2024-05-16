# Case - Fintech. 

## _**Stack utilizada**_:
- **_Back-end:_** 
    - Linguagem Java;
    - Banco de dados: Postgres;
    - Framework: SpringBoot. 
    
- **New _User_**:

```http
  POST api/users
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `name` | `string` | Nome do novo usuário. |
| `loanAmount` | `double` | Valor do empréstimo do novo usuário. |
| `income` | `double` | Valor da renda do usuário. |


```json
{
 "name": "Vitória Santos",
 "loanAmount": 1000.0,
 "income": 2000.0
}

```


### 🚧 Features

- `Fazer o CRUD completo`.
- `Utilizar Spring security para apenas usuários logados terem acesso aos Endpoints.`
- `Obter mais informações do usuário, para fazer uma verificação mais rigorosa antes de deixar ele solicitar o empréstimo.`
- `Adicionar outros tipos de exceções quando ter o CRUD completo.`
- `Fazer testes unitários.`
