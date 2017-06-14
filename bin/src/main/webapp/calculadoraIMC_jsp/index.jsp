<!DOCTYPE html>
<html lang="pt-br">
<html>
  <head>
    <meta charset="UTF-8">
    <title>Calculando IMC</title>
    <h1 class="heading">Calculando IMC</h1>
  </head>

<body>
    
<form name="imcForm" id="imcForm" action="#">

<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
<title>Calculadora IMC</title>
</head>
<body>

    <form name="imcForm" id="imcForm" action="#">
     <p>
    <p><br/><br/>
    Altura (cm)<br/>
        <input type="text" id="altura" name="altura" />
    </p>
    <p>Peso (kg) <br />
        <input type="text" id="peso" name="peso" />
    </p>
    <p>
    <label> 
        <input type="radio" name="sexo" value="op??o" id="sexo_0" />
    Masculino</label>
    <br />
    <label>
        <input type="radio" name="sexo" value="op??o" id="sexo_1" />
    Feminino</label>
    </div>
<p><input class=css_btn_class name="Enviar" type="submit" value="Calcular" onclick="calculadoraIMC_jsp" />
</p>

<%
String alturaStr = request.getParameter("altura");
String pesoStr = request.getParameter("peso");

alturaStr = alturaStr == null ? "1" : alturaStr;                    
pesoStr = pesoStr == null ? "0" : pesoStr;

double altura = Double.parseDouble(alturaStr);
double peso = Double.parseDouble(pesoStr);
double quadrado = (altura*altura);

double calculo = (10000*peso/quadrado);

String resultado = "";

if(calculo<17){
            resultado = "Voce esta MUITO ABAIXO DO PESO ! IMC " + calculo;
        }
	else if(calculo<=17 && calculo<=18.5){
             resultado = "Voce esta ABAIXO DO PESO ! IMC " + calculo;
        }
       else if(calculo>=18.5 && calculo<24.9){
            resultado = "Voce esta com o PESO NORMAL ! IMC: " + calculo;
        }
        else if(calculo>=25 && calculo<29.9) {
            resultado = "Voce esta ACIMA DO PESO ! IMC: " + calculo;
        }
        else if(calculo>=30 && calculo<34.9) {
            resultado = "Voce esta com OBESIDADE 1 ! IMC: " + calculo;
        }
		    else if(calculo>=35 && calculo<39.9) {
            resultado = "Voce esta com OBESIDADE 2 (severa)! IMC: " + calculo;
        }
        else if (calculo>=40){
       resultado = "Voce esta com OBESIDADE 3 (morbida)! IMC: " + calculo;
    }
%>

<div id="alert"> <%=resultado%> </div>
 </div>

  </form>
  
</body>