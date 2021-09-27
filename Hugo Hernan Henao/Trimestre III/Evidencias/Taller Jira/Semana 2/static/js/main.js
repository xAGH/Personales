function sumarSaldo(){
    let saldoInp = document.getElementById("saldo");
    let saldo = parseFloat(document.getElementById("saldo").value);
    let saldoSumaInp = parseFloat(document.getElementById("valor"));
    let saldoSuma = parseFloat(document.getElementById("valor").value);
    let suma = saldo + saldoSuma;
    saldoSumaInp.value = 0;
    saldoInp.value = suma;
    document.appendChild(saldoInp);
    document.appendChild(saldoSumaInp);
}

function restarSaldo(){
    let saldoInp = document.getElementById("saldo");
    let saldo = parseFloat(document.getElementById("saldo").value);
    let saldoRestaInp = parseFloat(document.getElementById("valor"));
    let saldoResta = parseFloat(document.getElementById("valor").value);
    let resta = saldo - saldoResta;
    saldoRestaInp.value = 0;
    saldoInp.value = resta;
    document.appendChild(saldoInp);
    document.appendChild(saldoRestaInp);
}