package pers.yangsongbao.minijvm.constant.constantInfo;

import pers.yangsongbao.minijvm.constant.ConstantInfo;
import pers.yangsongbao.minijvm.constant.ConstantPool;
import pers.yangsongbao.minijvm.print.Visitor;

public class StringInfo extends ConstantInfo {
    private int type = ConstantInfo.STRING_INFO;
    private int index;

    public StringInfo(ConstantPool pool) {
        super(pool);
    }

    @Override
    public int getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public String toString() {
        return this.getConstantPool().getUTF8String(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }

}
