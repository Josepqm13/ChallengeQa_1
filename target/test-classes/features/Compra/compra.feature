#language:es

Característica: Flujo de compra en Sauce Demo
  Como usuario,
  Quiero realizar una compra en la página Sauce Demo,
  Para poder adquirir productos.

  Antecedentes: Dado que estoy en el sitio web de Sauce Demo
    Y estoy autenticado con el nombre de usuario "standard_user" y la contraseña "secret_sauce"

  @Paso1
  Escenario: Agregar productos al carrito
    Dado que estoy en la página de productos
    Cuando añado "Sauce Labs Producto 1" al carrito
    Y añado "Sauce Labs Producto 2" al carrito
    Entonces el carrito debe contener 2 productos

  Escenario: Visualizar el carrito
    Dado que estoy en la página del carrito
    Entonces debo ver los productos añadidos en el carrito

  Escenario: Completar el formulario de compra
    Dado que estoy en la página de información de pago
    Cuando ingreso la información personal
    Y hago clic en el botón Continuar
    Y ingreso la información de envío
    Y hago clic en el botón Continuar
    Y ingreso la información de pago
    Y hago clic en el botón Finalizar
    Entonces debo ver el mensaje de confirmación "THANK YOU FOR YOUR ORDER"

