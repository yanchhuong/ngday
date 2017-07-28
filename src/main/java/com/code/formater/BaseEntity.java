<<<<<<< HEAD
package com.code.formater;

import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.annotations.TypeDef;

@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonStringType.class),
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
@MappedSuperclass
=======
package com.code.formater;

import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.annotations.TypeDef;

@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonStringType.class),
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
@MappedSuperclass
>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
public class BaseEntity { }