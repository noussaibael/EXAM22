<!DOCTYPE html>
<html>
<head>
    <title>Affecter Employé à Projet</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Affecter Employé à Projet</h1>
    <form action="/affecter" method="post">
        <div class="form-group">
            <label for="employeeName">Nom de l'employé :</label>
            <input type="text" id="employeeName" name="employeeName" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="projectName">Nom du projet :</label>
            <input type="text" id="projectName" name="projectName" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="implicationPercentage">Implication:</label>
            <input type="number" id="implicationPercentage" name="implicationPercentage" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Affecter</button>
    </form>
</div>
<!-- Bootstrap JS -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
