<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dados do Covid</title>

<!-- Css -->
<link rel="stylesheet" href="../../resources/css/reset.css">
<link rel="stylesheet" href="../../resources/css/padroes.css">
<link rel="stylesheet" href="../../resources/css/index.css">

<!-- Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&display=swap"
	rel="stylesheet">

<!-- Js -->
<script src="../../resources/js/jquery-3.5.1.min.js"></script>
</head>

<body>
	<main class="main-content-data">
		<form class="section-form__form-input-data">
			<fieldset class="form-input-data__input-other-info">
				<div class="input-other-info__header">
					<h2 class="header--title">Dados do Covid19</h2>
					<p class="header--subtitle">Selecione o seu estado e sua cidade
						para apresentar as informações sobre a covid no seu estado</p>
				</div>

				<div class="input-other-info__inputs">
					<select id="estado" name="estado" class="input-data">
						<option disabled selected>Selecione...</option>
						<option value="AC">Acre</option>
						<option value="AL">Alagoas</option>
						<option value="AP">Amapá</option>
						<option value="AM">Amazonas</option>
						<option value="BA">Bahia</option>
						<option value="CE">Ceará</option>
						<option value="DF">Distrito Federal</option>
						<option value="ES">Espírito Santo</option>
						<option value="GO">Goiás</option>
						<option value="MA">Maranhão</option>
						<option value="MT">Mato Grosso</option>
						<option value="MS">Mato Grosso do Sul</option>
						<option value="MG">Minas Gerais</option>
						<option value="PA">Pará</option>
						<option value="PB">Paraíba</option>
						<option value="PR">Paraná</option>
						<option value="PE">Pernambuco</option>
						<option value="PI">Piauí</option>
						<option value="RJ">Rio de Janeiro</option>
						<option value="RN">Rio Grande do Norte</option>
						<option value="RS">Rio Grande do Sul</option>
						<option value="RO">Rondônia</option>
						<option value="RR">Roraima</option>
						<option value="SC">Santa Catarina</option>
						<option value="SP">São Paulo</option>
						<option value="SE">Sergipe</option>
						<option value="TO">Tocantins</option>
						<option value="EX">Estrangeiro</option>
					</select> <input type="text" name="" id="input-city"
						placeholder="p. Ex: São Paulo" class="input-data"> <input
						type="submit" value="Pesquisar" class="input-submit">
				</div>
			</fieldset>
			<div class="validation">
				<h3>Campos invalidos</h3>
			</div>

		</form>

		<section class="main-content-data__section-output">
			<div class="section-output__card">
				<h2 class="header--subtitle">Número de casos</h2>
				<p class="header--description">...</p>
			</div>

			<div class="section-output__card">
				<h2 class="header--subtitle">Mortes confirmadas</h2>
				<p class="header--description">...</p>
			</div>

			<div class="section-output__card">
				<h2 class="header--subtitle">Data de atualização</h2>
				<p class="header--description">...</p>
			</div>
		</section>
	</main>
	<script src="../../resources/js/index.js"></script>
</body>

</html>