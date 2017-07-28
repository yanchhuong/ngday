<<<<<<< HEAD
package com.code.formater;

import java.util.Properties;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

public class JsonBinaryType extends AbstractSingleColumnStandardBasicType<Object> 
implements DynamicParameterizedType {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public JsonBinaryType() {
    super( 
        JsonBinarySqlTypeDescriptor.INSTANCE, 
        new JsonTypeDescriptor(null)
    );
}

public String getName() {
    return "jsonb";
}

@Override
public void setParameterValues(Properties parameters) {
    ((JsonTypeDescriptor) getJavaTypeDescriptor())
        .setParameterValues(parameters);
}


=======
package com.code.formater;

import java.util.Properties;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

public class JsonBinaryType extends AbstractSingleColumnStandardBasicType<Object> 
implements DynamicParameterizedType {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public JsonBinaryType() {
    super( 
        JsonBinarySqlTypeDescriptor.INSTANCE, 
        new JsonTypeDescriptor(null)
    );
}

public String getName() {
    return "jsonb";
}

@Override
public void setParameterValues(Properties parameters) {
    ((JsonTypeDescriptor) getJavaTypeDescriptor())
        .setParameterValues(parameters);
}


>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
}