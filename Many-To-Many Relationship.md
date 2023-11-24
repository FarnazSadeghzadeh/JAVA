Q: what to do if join table in Many-To-Many relationship have additional atributes?

A:
    Modeling Many-To-Many association in a specific table model needs an association table, that refrences the primary keys of the associated records.
    To store any additional information for this relationship, we could add columns to the association table.
    With JPA and Hibernate, the most popular approach maps a many-to-many association to an attribute of type java.util.Set. 
    That mapping hides the association table and makes the association very easy to use.
    But it also makes it impossible to map any additional columns that are part of the association table.
    We can only map these columns by using a domain model that’s closer to the actual table model. 
    Using the Mapping
        That’s all we need to do to map a many-to-many association with additional attributes.
        We can then use the 2 many-to-one associations in the same way as any other many-to-one association.
    Mapping the Association Table
        We can map that with an embeddable that represents the primary key and 2 @MapsId annotations.
        The annotations tell Hibernate to which attribute of the embeddable it shall assign the primary key value of the associated entity.
        The implementation of the embeddable is pretty simple. It needs to implement the Serializable interface and the attributes. 
    Mapping as a Bidirectional Association
        And if we want to map them as bidirectional associations, we need to model the referencing side of the association on the table and wanted entity.


        
        




    
