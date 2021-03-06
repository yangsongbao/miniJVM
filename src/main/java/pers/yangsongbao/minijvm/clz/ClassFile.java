package pers.yangsongbao.minijvm.clz;

import pers.yangsongbao.minijvm.attribute.AttributeInfo;
import pers.yangsongbao.minijvm.constant.ConstantPool;
import pers.yangsongbao.minijvm.constant.constantInfo.ClassInfo;
import pers.yangsongbao.minijvm.field.Field;
import pers.yangsongbao.minijvm.interfaze.Interface;
import pers.yangsongbao.minijvm.method.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author songbao.yang
 * @date 2017/12/17
 */
public class ClassFile {

    private int minorVersion;
    private int majorVersion;

    private ConstantPool constantPool;
    private AccessFlag accessFlag;
    private ClassIndex classIndex;
    private List<Interface> interfaces = new ArrayList<>();
    private List<Field> fields = new ArrayList<Field>();
    private List<Method> methods = new ArrayList<>();
    private List<AttributeInfo> attributes = new ArrayList<>();

    public Method getMethod(String methodName, String paramAndReturnType) {
        for (Method method : methods) {
            String name = constantPool.getUTF8String(method.getNameIndex());
            String descriptor = constantPool.getUTF8String(method.getDescriptorIndex());
            if (methodName.equals(name) && paramAndReturnType.equals(descriptor)) {
                return method;
            }
        }
        return null;
    }

    public String getClassName() {
        int thisClassIndex = this.classIndex.getThisClassIndex();
        ClassInfo thisClass = (ClassInfo) this.getConstantPool().getConstantInfo(thisClassIndex);
        return thisClass.getClassName();
    }

    public String getSuperClassName() {
        ClassInfo superClass = (ClassInfo) this.getConstantPool().getConstantInfo(this.classIndex.getSuperClassIndex());
        return superClass.getClassName();
    }

    public Method getMainMethod() {
        return getMethod("main", "([Ljava/lang/String;)V");
    }

    public void addInterface(Interface anInterface) {
        interfaces.add(anInterface);
    }

    public void addField(Field field) {
        fields.add(field);
    }

    public void addMethod(Method method) {
        methods.add(method);
    }

    public void addAttributeInfo(AttributeInfo attributeInfo) {
        attributes.add(attributeInfo);
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public AccessFlag getAccessFlag() {
        return accessFlag;
    }

    public void setAccessFlag(AccessFlag accessFlag) {
        this.accessFlag = accessFlag;
    }

    public ClassIndex getClassIndex() {
        return classIndex;
    }

    public void setClassIndex(ClassIndex classIndex) {
        this.classIndex = classIndex;
    }

    public ConstantPool getConstantPool() {
        return constantPool;
    }

    public void setConstantPool(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<AttributeInfo> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeInfo> attributes) {
        this.attributes = attributes;
    }

}
