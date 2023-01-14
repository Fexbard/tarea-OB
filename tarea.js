// PRIMER ÍTEM - "IF".
var numeroIf = 7;
if (numeroIf > 0) {
  system.out.println("es un número positivo");
} else if (numeroIf < 0) {
  system.out.println("el número es negativo");
} else {
  system.out.println("el número es cero");
}

//SEGUNDO ÍTEM "WHILE"
var numeroWhile = 0;
while (numeroWhile < 3) {
  system.out.println("El numeroWhile es: " + numeroWhile);
  numeroWhile = numeroWhile + 1 //también puedo usar el numeroWhile ++ en el incremento
}

// TERCER ÍTEM DO WHILE
var numeroWhile = 2;
do {
  system.out.println("El numeroWhile es: " + numeroWhile);
  numeroWhile = numeroWhile + 1
}
while (numeroWhile < 2);

// CUARTO ÍTEM FOR
var numeroFor = 0;
for (numeroFor = 0; numeroFor <= 3; ++) {
  sytem.out.println(numeroFor);
}
//QUINTO ÍTEM SWITCH

var estacion = "";
switch (expression) {
  case "primavera":
console.log("La estación es primavera");
    break;
  case "verano":
console.log("La estación es verano");
    break;
  case "otoño":
console.log("La estación es otoño");
    break;
  case "invierno":
  console.log("La estación es invierno");
    break;
  default:
  System.out.println("No corresponde a una estación");
        break;

}
