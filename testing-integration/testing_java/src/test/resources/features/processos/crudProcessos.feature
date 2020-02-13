#language: pt

  @run
Funcionalidade: Realizando um simples CRUD na classe de processo

  Cenário: Simples POST
    Dado que o usuário está na página de processos
    E o usuário informa no campo "vara" o valor "258"
    E o usuário informa no campo "numero_processo" o valor "15748"
    E o usuário informa no campo "natureza" o valor "Guarda"
    E o usuário informa no campo "partes" o valor "Alberto x Alberta"
    E o usuário informa no campo "urgente" o valor "S"
    E o usuário informa no campo "arbitramento" o valor "N"
    E o usuário informa no campo "assistente_social" o valor "Dayane Moreira"
    E o usuário informa no campo "data_entrada" o valor "2020-02-12"
    E o usuário informa no campo "data_saida" o valor "2020-02-20"
    E o usuário informa no campo "data_agendamento" o valor "2020-02-13"
    E o usuário informa no campo "status" o valor "Aguardando"
    E o usuário informa no campo "observacao" o valor "Nada a Declarar"
    Quando o usuário clicar em salvar
    Então o usuário deveria receber uma mensagem de "sucesso"

    Esquema do Cenario: : Simples GET com todos os campos preenchidos corretamente
      Dado que o usuario esta na pagina de processos
      E o usuário gostaria de visualizar o preocesso com id <id>
      Quando o usuário clicar em visualizar
      Então o usuário deveria receber uma mensagem de "<mensagem>"

      Exemplos:
        |  id   | mensagem       |
        |7      | sucesso        |
        |321332 | não encontrado |
