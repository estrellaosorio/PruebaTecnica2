# language: es
# Author: Estrella Osorio
# encoding: UTF-8

  @FlujoDeCompra
  Característica: Product Store

    @IniciarSesion
    Escenario: Iniciar Sesion en la pagina
      Dado que el usuario quiere hacer login en la pagina
      Cuando Ingresa a Pagina Store con usuario y contraseña
      Entonces realiza el login y se muestra Welcome pruebaqa123

    @CompraProducto
    Esquema del escenario: Compra correcta
       Dado Ingresa a la Pagina para comprar
       Cuando el usuario agrega un producto al carrito
       Entonces se realiza la compra y se muestra <mensajeexitoso>
      Ejemplos:
      |mensajeexitoso|
      |Thank you for your purchase!|