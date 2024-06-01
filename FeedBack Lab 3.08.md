
Your submitted this lab on  May 25th 2024.

**Modelado de la Asociación de Enfermeras**

Has realizado un excelente trabajo modelando las relaciones de la Asociación de Enfermeras. Has definido correctamente las entidades  `Division`  y  `Member`, así como el enumerado  `Status`. La relación  `@OneToOne`  entre  `Division`  y  `Member`  para el presidente de división está correcta, al igual que la relación  `@OneToMany`  para los miembros de cada división. Solo hay un detalle menor, asegúrate de que todos los nombres de las columnas y las referencias a tablas correspondan a lo que se espera en un esquema de base de datos real. ¡Buen trabajo!

Was this feedback useful?

**Modelado de la aplicación de Gestión de Eventos**

¡Muy bien! Las relaciones entre  `Event`,  `Guest`,  `Conference`,  `Exposition`  y  `Speaker`  se han modelado adecuadamente, empleando la herencia de entidades y las anotaciones JPA como  `@Inheritance`  y  `@DiscriminatorValue`. Tu uso de  `@OneToMany`  y  `@ManyToOne`  ha sido aplicado de manera coherente para relacionar las entidades según el dominio del problema. Un punto a considerar es verificar que las columnas discriminadoras en la estrategia de herencia SINGLE_TABLE sean consistentes y claras para quien maneje la base de datos. Excelente trabajo con las entidades y las relaciones.
