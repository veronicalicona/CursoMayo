#Veronica
#21-05-2022
Feature: leave principal
@leave
  Scenario Outline: agregar empleado
    Given abrir el navegador
    And diligenciar usuario <userName> y password <contrasena>
    And Llegar hasta leave
   

    Examples: 
      | userName | contrasena |
      | Admin    | admin123   |