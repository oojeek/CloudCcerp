package com.sealinetech.utils;

import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

/**
 * Created by OOJEEK on 2016/10/27.
 */
public class SealineMybatis3Impl extends IntrospectedTableMyBatis3Impl {
//    @Override
//    protected String calculateMyBatis3XmlMapperFileName() {
//        StringBuilder sb = new StringBuilder();
//        if (stringHasValue(tableConfiguration.getMapperName())) {
//            String mapperName = tableConfiguration.getMapperName();
//            int ind = mapperName.lastIndexOf('.');
//            if (ind == -1) {
//                sb.append(mapperName);
//            } else {
//                sb.append(mapperName.substring(ind + 1));
//          }
//            sb.append(".xml"); //$NON-NLS-1$
//        } else {
//            sb.append(fullyQualifiedTable.getDomainObjectName());
//            sb.append("Dao.xml"); //$NON-NLS-1$
//        }
//        return sb.toString();
//    }

    @Override
    protected void calculateJavaClientAttributes() {
        if (context.getJavaClientGeneratorConfiguration() == null) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(calculateJavaClientImplementationPackage());
        sb.append('.');
        sb.append(fullyQualifiedTable.getDomainObjectName());
        sb.append("DAOImpl"); //$NON-NLS-1$
        setDAOImplementationType(sb.toString());

        sb.setLength(0);
        sb.append(calculateJavaClientInterfacePackage());
        sb.append('.');
        sb.append(fullyQualifiedTable.getDomainObjectName());
        sb.append("DAO"); //$NON-NLS-1$
        setDAOInterfaceType(sb.toString());

        sb.setLength(0);
        sb.append(calculateJavaClientInterfacePackage());
        sb.append('.');
        if (stringHasValue(tableConfiguration.getMapperName())) {
            sb.append(tableConfiguration.getMapperName());
        } else {
            sb.append(fullyQualifiedTable.getDomainObjectName());
            sb.append("Dao"); //$NON-NLS-1$
        }
        setMyBatis3JavaMapperType(sb.toString());

        sb.setLength(0);
        sb.append(calculateJavaClientInterfacePackage());
        sb.append('.');
        if (stringHasValue(tableConfiguration.getSqlProviderName())) {
            sb.append(tableConfiguration.getSqlProviderName());
        } else {
            sb.append(fullyQualifiedTable.getDomainObjectName());
            sb.append("SqlProvider"); //$NON-NLS-1$
        }
        setMyBatis3SqlProviderType(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        //boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(
                Surrogate.Generator.class.getResourceAsStream("/generatorConfig.xml"));
        // 覆盖
        DefaultShellCallback callback = new DefaultShellCallback(true);
        SealineMybatisGenerator myBatisGenerator = new SealineMybatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
