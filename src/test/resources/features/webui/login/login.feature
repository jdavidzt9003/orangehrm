Feature: Yo como automatizador de pruebas
  deseo probar la seccion de login de la aplicación orangeHRM
  para verificar que la página cumpla los criterios de login

  Background:
    Given el usuario ingresa a la pagina de OrangeHRM sección login

  Scenario: Inicio de sesion exitoso
    When el usuario ingresa los datos de usuario y contraseña
    Then el sistema permite el login exitoso

  Scenario: Inicio de sesión donde el password inválido
    When el usuario ingresa el usuario correcto y el password inválido
    Then el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas

  Scenario: Inicio de sesión donde el usuario es inválido
    When el usuario ingresa el usuario inválido y el password correcto
    Then el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas

  Scenario: Inicio de sesión donde no se introducen las credenciales
    When el usuario deja los campos usuario y password vacios
    Then el sistema no debe permitir el ingreso y debe arrojar el mensaje de campo vacío