#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco

Feature: Registro en la pagina Booking

  Scenario Outline: agregar empleado
    Given abrir el navegador
    And diligenciar usuario <userName> y password <contrasena>
    And llegar a pim
    When diligenciar nombre <firstname> y apellido <lastname>

    Examples: 
      | userName | contrasena | firstname | lastname |
      | Admin    | admin123   | Ana       | Suarez   |
