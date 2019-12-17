package com.si2a.annotationrepeteable;

import java.lang.annotation.Repeatable;

@Repeatable(Modifiees.class)
public @interface Modifiee {

	String auteur() default "inconnu";

}
