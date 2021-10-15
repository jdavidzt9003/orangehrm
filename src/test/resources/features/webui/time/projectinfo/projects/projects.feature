Feature: Yo como automatizador
  quiero crear un nuevo proyecto, agregando el customer y minimos dos administradores de proyecto. Copiando información de otro proyecto con todos sus items
  donde el sistema me permita la creación del nuevo proyecto

  Scenario: Agregar nuevo proyecto
    Given el usuario esta en la página OrangeHRM modulo time project info
    When agrega un nuevo proyecto haciendo la creacion de un cliente e ingresando minimo dos administradores de proyecto
    Then el sistema deberá permitir la creación del nuevo proyecto