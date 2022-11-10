readlineSync = require('readline-sync');

var cadastro = [];
var seguir = "s";
qntDeParticipantes = 0;
var nome = "";
var evento = "";
var idade = 0;

while (seguir === "s") {
    if (qntDeParticipantes < 100) {
        nome = readlineSync.question('Digite seu nome');
        evento = readlineSync.question('Digite o nome do evento');
        idade = parseFloat(readlineSync.question('Digite sua idade'));
        qntDeParticipantes++;
    } else {
        console.log("Cadastro não é permitido pelo excesso de participantes!");
    }
    if (idade > 18) {
        cadastro.unshift(nome);
        cadastro.unshift(evento);
        cadastro.unshift(idade);
    } else {
        console.log("Cadastro não é permitido pela idade!");
    }
    seguir = readlineSync.question('Informe s para novo.');
}
console.log("Lista dos cadastrados a seguir:");
cadastro.forEach(participante => {
    console.log(participante);
});
