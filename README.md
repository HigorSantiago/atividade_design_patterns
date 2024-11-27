Design Pattern Escolhido - Template Method

Template Method consiste no uso de herança para trazer comportamentos ao código e alterar por meio de Hooks ou Sobrescrever, nesse caso, optei por utilizar o sobrescrever.

Ideia do Problema - Ao realizar uma assinatura, o debito é feito de forma automatica, porém existem meios de pagamento diferente, como por exemplo, o cartão e o pix
Consequência - Criei uma classe abstrata onde trazia metodos padrões para ambos em relação ao fluxo de pagamento, porém adicionei metodos nas classes de pagamento automatico com Pix e com Cartão
