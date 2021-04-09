package com.example.demo.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2018-06-12T21:09:01.116+0900")
public final class _Sampletbl extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.demo.entity.Sampletbl> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final _Sampletbl __singleton = new _Sampletbl();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.demo.entity.Sampletbl, java.math.BigDecimal, Object> $id = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.demo.entity.Sampletbl.class, java.math.BigDecimal.class, java.math.BigDecimal.class, () -> new org.seasar.doma.wrapper.BigDecimalWrapper(), null, null, "id", "id", __namingType, true, true, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.demo.entity.Sampletbl, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.demo.entity.Sampletbl.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "name", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.demo.entity.Sampletbl>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> __entityPropertyTypeMap;

    private _Sampletbl() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Sampletbl";
        __catalogName = "";
        __schemaName = "";
        __tableName = "sampletbl";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> __map = new java.util.HashMap<>(2);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.example.demo.entity.Sampletbl entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.demo.entity.Sampletbl> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.demo.entity.Sampletbl entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.demo.entity.Sampletbl> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.demo.entity.Sampletbl entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.demo.entity.Sampletbl> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.demo.entity.Sampletbl entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.demo.entity.Sampletbl> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.demo.entity.Sampletbl entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.demo.entity.Sampletbl> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.demo.entity.Sampletbl entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.demo.entity.Sampletbl> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.demo.entity.Sampletbl, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.example.demo.entity.Sampletbl, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.demo.entity.Sampletbl, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, com.example.demo.entity.Sampletbl, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public com.example.demo.entity.Sampletbl newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.demo.entity.Sampletbl, ?>> __args) {
        com.example.demo.entity.Sampletbl entity = new com.example.demo.entity.Sampletbl();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.demo.entity.Sampletbl> getEntityClass() {
        return com.example.demo.entity.Sampletbl.class;
    }

    @Override
    public com.example.demo.entity.Sampletbl getOriginalStates(com.example.demo.entity.Sampletbl __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.demo.entity.Sampletbl __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Sampletbl getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Sampletbl newInstance() {
        return new _Sampletbl();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.example.demo.entity.Sampletbl> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
