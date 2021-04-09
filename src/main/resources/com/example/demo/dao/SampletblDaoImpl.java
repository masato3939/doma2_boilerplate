package com.example.demo.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2018-06-12T21:09:01.464+0900")
public class SampletblDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.example.demo.dao.SampletblDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.dao.SampletblDao.class, "insert", com.example.demo.entity.Sampletbl.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.dao.SampletblDao.class, "update", com.example.demo.entity.Sampletbl.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.dao.SampletblDao.class, "delete", com.example.demo.entity.Sampletbl.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.demo.dao.SampletblDao.class, "selectid");

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public SampletblDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int insert(com.example.demo.entity.Sampletbl entity) {
        entering("com.example.demo.dao.SampletblDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.demo.entity.Sampletbl> __query = getQueryImplementors().createAutoInsertQuery(__method0, com.example.demo.entity._Sampletbl.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.example.demo.dao.SampletblDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.dao.SampletblDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.dao.SampletblDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.example.demo.entity.Sampletbl entity) {
        entering("com.example.demo.dao.SampletblDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.example.demo.entity.Sampletbl> __query = getQueryImplementors().createAutoUpdateQuery(__method1, com.example.demo.entity._Sampletbl.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.example.demo.dao.SampletblDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.dao.SampletblDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.dao.SampletblDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(com.example.demo.entity.Sampletbl entity) {
        entering("com.example.demo.dao.SampletblDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<com.example.demo.entity.Sampletbl> __query = getQueryImplementors().createAutoDeleteQuery(__method2, com.example.demo.entity._Sampletbl.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.example.demo.dao.SampletblDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.dao.SampletblDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.dao.SampletblDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public com.example.demo.entity.Sampletbl selectid() {
        entering("com.example.demo.dao.SampletblDaoImpl", "selectid");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/example/demo/dao/SampletblDao/selectid.sql");
            __query.setEntityType(com.example.demo.entity._Sampletbl.getSingletonInternal());
            __query.setCallerClassName("com.example.demo.dao.SampletblDaoImpl");
            __query.setCallerMethodName("selectid");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.example.demo.entity.Sampletbl> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.demo.entity.Sampletbl>(com.example.demo.entity._Sampletbl.getSingletonInternal()));
            com.example.demo.entity.Sampletbl __result = __command.execute();
            __query.complete();
            exiting("com.example.demo.dao.SampletblDaoImpl", "selectid", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.demo.dao.SampletblDaoImpl", "selectid", __e);
            throw __e;
        }
    }

}
