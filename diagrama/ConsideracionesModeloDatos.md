# Final Lentti

## Aclaraciones/Justificaciones
    - Los itemRestaurant son los que van a figurar en el "menu" de cada restaurant en la App y este puede contener uno o varios productos
    - La relacion de itemRestaurant es ManyToMany por reutilizar los productos entre distintos retaurantes
    - El itemPedido repite el precio por consistencia de datos, si el restaurant cambia el precio de un itemProducto este no va a variar
    - Ademas de Entrega que modelamos como entidad, hicimos una PropuestaDeEntrega porque entendemos que los repartidores puede rechazar o aceptar las entregas y de esta forma podemos llevar el rastro de que entregas rechaza cada colaborador y podriamos generar alguna estadística
    
