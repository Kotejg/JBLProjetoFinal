<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

    <title>PROJETO FINAL</title>
</head>

<body>
    <header class="bg-success">
        <div class="container-fluid">
            <div class="row mb-5">
                <h4> Jeff - Novo Usuario</h4>
            </div>
        </div>
    </header>


  <div class="container mt-5">
    <div class="row">
      <div class="col-md-5 mx-auto border text-center">
        <h3>Adicionar Usuario</h3>
        <form name="frmCalculadora" method="post" action="ServletUser">
          <!-- nome -->
          <div class="form-group" style="text-align-last: left;">
            <label for="nome" class="form-label">Nome:</label>
            <input type="text" class="form-control" id="nome"  name="nome" required>
          </div>
          
          <!-- email -->
          <div class="form-group" style="text-align-last: left;">
            <label for="email">Email:</label>
            <input type="text" class="form-control" id="email" name="email" required>
          </div>
          <!-- telefone -->
          <div class="form-group" style="text-align-last: left;">
            <label for="telefone">Telefone:</label>
            <input type="number" class="form-control" id="telefone" name="telefone" required>
          </div>
          <!-- pais -->
          <div class="form-group" style="text-align-last: left;">
            <label for="pais" class="form-label">Pais:</label>
            <input type="text" class="form-control" id="pais" name="pais" required>
          </div>

          <button type="submit" name="btnCadastrar" class="btn btn-success mt-3 mb-2">Salvar</button> 
      
        </form>

		

      </div>
    </div>
  </div>

</body>
</html>