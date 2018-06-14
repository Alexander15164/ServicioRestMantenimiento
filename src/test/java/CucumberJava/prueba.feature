Feature: Prueba de Rest de resource Marca
Scenario: Obtener lista de recursos
When tengo un "path"
Then hago una peticion al resource 
Then obtengo una respuesta
Then obtengo un estado 200
Then obtengo una lista de marcas
