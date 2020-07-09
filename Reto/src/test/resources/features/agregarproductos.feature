#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#
#										 												METRO
#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#
#         Authors:
#        	Diego ALejandro Zapata Betancur
#
#-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------#
Feature:: Reto 1 
  
  #------------------------------------------------------------------------------------OK
  @AgregarProductoAlCarrito
  Scenario Outline: El cliente agrega un producto al carrito de compras.
    Given El cliente abre la pagina web metro
    When Busca un producto
    |televisor|
    |<televisor>|
    When Agrega el producto buscado al carrito de compras     
		Then verifica que se encuentre el producto agregado en el carrito de compras
		 |televisor|
    |<televisor>|

		Examples:
		|televisor 																 |
		|LG Smart TV OLED 55" UHD OLED55B9 ThinQ AI|