INSERT INTO clientes (id_cliente, nombre, activo) VALUES(710020, 'Eduardo Lopez', 1);
INSERT INTO clientes (id_cliente, nombre, activo) VALUES(720010, 'Nanci Correa', 1);


INSERT INTO productos (id_producto, clave, descripcion, activo) VALUES(10200, 'TRP0001', 'Producto 0001 Truper', 1)
INSERT INTO productos (id_producto, clave, descripcion, activo) VALUES(25020, 'TRP0002', 'Producto 0002 Truper', 1)
INSERT INTO productos (id_producto, clave, descripcion, activo) VALUES(10170, 'TRP0003', 'Producto 0003 Truper', 1)
INSERT INTO productos (id_producto, clave, descripcion, activo) VALUES(10280, 'TRP0004', 'Producto 0004 Truper', 1)
INSERT INTO productos (id_producto, clave, descripcion, activo) VALUES(30001, 'TRP0005', 'Producto 0005 Truper', 1)
INSERT INTO productos (id_producto, clave, descripcion, activo) VALUES(18156, 'TRP0006', 'Producto 0006 Truper', 1)


INSERT INTO Lista_Compra (id_lista, customer_id, nombre, fecha_registro, fecha_ultima_actualizacion, activo) VALUES(1, 720010, 'Lista Mensual', '2022-09-22', '2022-09-22', 1);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(1, 1, 1, 18156, 5);

INSERT INTO Lista_Compra (id_lista, customer_id, nombre, fecha_registro, fecha_ultima_actualizacion, activo) VALUES(2, 710020, 'Lista Semanal', '2022-09-22', '2022-09-22', 1);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(2, 2, 2, 10200, 5);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(3, 3, 2, 25020, 6);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(4, 4, 2, 10170, 1);


INSERT INTO Lista_Compra (id_lista, customer_id, nombre, fecha_registro, fecha_ultima_actualizacion, activo) VALUES(3, 710020, 'Lista Anual', '2022-09-22', '2022-09-22', 1);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(5, 5, 3, 10280, 2);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(6, 6, 3, 30001, 3);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(7, 7, 3, 10200, 7);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(8, 8, 3, 25020, 2);
INSERT INTO Lista_Compra_Detalle(id_lista_compra_detalle, codigo_producto, id_lista_compra, id_codigo_producto, cantidad) VALUES(9, 9, 3, 10170, 9);
