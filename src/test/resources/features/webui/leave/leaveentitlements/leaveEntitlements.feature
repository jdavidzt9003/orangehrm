Feature: yo como automatizador de pruebas
  requiero programar el periodo de vacaciones a un empleado
  donde el sistema me arroje que ha sido exitosa la programación

  Scenario: Para un empleado existente, programarle el período de vacaciones
    Given el automatizador se encuentra en la pagina de OrangeHRM modulo leave
    Then el usuario ingresa los campos solicitados por el formulario para la programación de las vacaciones
    When el sistema arroja que se ha agregado el empleado al periodo de vacaciones