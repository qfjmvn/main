package quickfix.fixt11;

import quickfix.FieldNotFound;
import quickfix.Group;


public class Logon extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "A";

    public Logon() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public Logon(quickfix.field.EncryptMethod encryptMethod,
        quickfix.field.HeartBtInt heartBtInt,
        quickfix.field.DefaultApplVerID defaultApplVerID) {
        this();
        setField(encryptMethod);
        setField(heartBtInt);
        setField(defaultApplVerID);
    }

    public void set(quickfix.field.EncryptMethod value) {
        setField(value);
    }

    public quickfix.field.EncryptMethod get(quickfix.field.EncryptMethod value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncryptMethod getEncryptMethod()
        throws FieldNotFound {
        quickfix.field.EncryptMethod value = new quickfix.field.EncryptMethod();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncryptMethod field) {
        return isSetField(field);
    }

    public boolean isSetEncryptMethod() {
        return isSetField(98);
    }

    public void set(quickfix.field.HeartBtInt value) {
        setField(value);
    }

    public quickfix.field.HeartBtInt get(quickfix.field.HeartBtInt value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
        quickfix.field.HeartBtInt value = new quickfix.field.HeartBtInt();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.HeartBtInt field) {
        return isSetField(field);
    }

    public boolean isSetHeartBtInt() {
        return isSetField(108);
    }

    public void set(quickfix.field.RawDataLength value) {
        setField(value);
    }

    public quickfix.field.RawDataLength get(quickfix.field.RawDataLength value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.RawDataLength getRawDataLength()
        throws FieldNotFound {
        quickfix.field.RawDataLength value = new quickfix.field.RawDataLength();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.RawDataLength field) {
        return isSetField(field);
    }

    public boolean isSetRawDataLength() {
        return isSetField(95);
    }

    public void set(quickfix.field.RawData value) {
        setField(value);
    }

    public quickfix.field.RawData get(quickfix.field.RawData value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.RawData getRawData() throws FieldNotFound {
        quickfix.field.RawData value = new quickfix.field.RawData();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.RawData field) {
        return isSetField(field);
    }

    public boolean isSetRawData() {
        return isSetField(96);
    }

    public void set(quickfix.field.ResetSeqNumFlag value) {
        setField(value);
    }

    public quickfix.field.ResetSeqNumFlag get(
        quickfix.field.ResetSeqNumFlag value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.ResetSeqNumFlag getResetSeqNumFlag()
        throws FieldNotFound {
        quickfix.field.ResetSeqNumFlag value = new quickfix.field.ResetSeqNumFlag();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.ResetSeqNumFlag field) {
        return isSetField(field);
    }

    public boolean isSetResetSeqNumFlag() {
        return isSetField(141);
    }

    public void set(quickfix.field.NextExpectedMsgSeqNum value) {
        setField(value);
    }

    public quickfix.field.NextExpectedMsgSeqNum get(
        quickfix.field.NextExpectedMsgSeqNum value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NextExpectedMsgSeqNum getNextExpectedMsgSeqNum()
        throws FieldNotFound {
        quickfix.field.NextExpectedMsgSeqNum value = new quickfix.field.NextExpectedMsgSeqNum();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NextExpectedMsgSeqNum field) {
        return isSetField(field);
    }

    public boolean isSetNextExpectedMsgSeqNum() {
        return isSetField(789);
    }

    public void set(quickfix.field.MaxMessageSize value) {
        setField(value);
    }

    public quickfix.field.MaxMessageSize get(
        quickfix.field.MaxMessageSize value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.MaxMessageSize getMaxMessageSize()
        throws FieldNotFound {
        quickfix.field.MaxMessageSize value = new quickfix.field.MaxMessageSize();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.MaxMessageSize field) {
        return isSetField(field);
    }

    public boolean isSetMaxMessageSize() {
        return isSetField(383);
    }

    public void set(quickfix.fixt11.component.MsgTypeGrp component) {
        setComponent(component);
    }

    public quickfix.fixt11.component.MsgTypeGrp get(
        quickfix.fixt11.component.MsgTypeGrp component)
        throws FieldNotFound {
        getComponent(component);

        return component;
    }

    public quickfix.fixt11.component.MsgTypeGrp getMsgTypeGrp()
        throws FieldNotFound {
        quickfix.fixt11.component.MsgTypeGrp component = new quickfix.fixt11.component.MsgTypeGrp();
        getComponent(component);

        return component;
    }

    public void set(quickfix.field.NoMsgTypes value) {
        setField(value);
    }

    public quickfix.field.NoMsgTypes get(quickfix.field.NoMsgTypes value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoMsgTypes getNoMsgTypes() throws FieldNotFound {
        quickfix.field.NoMsgTypes value = new quickfix.field.NoMsgTypes();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoMsgTypes field) {
        return isSetField(field);
    }

    public boolean isSetNoMsgTypes() {
        return isSetField(384);
    }

    public void set(quickfix.field.TestMessageIndicator value) {
        setField(value);
    }

    public quickfix.field.TestMessageIndicator get(
        quickfix.field.TestMessageIndicator value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.TestMessageIndicator getTestMessageIndicator()
        throws FieldNotFound {
        quickfix.field.TestMessageIndicator value = new quickfix.field.TestMessageIndicator();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.TestMessageIndicator field) {
        return isSetField(field);
    }

    public boolean isSetTestMessageIndicator() {
        return isSetField(464);
    }

    public void set(quickfix.field.Username value) {
        setField(value);
    }

    public quickfix.field.Username get(quickfix.field.Username value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.Username getUsername() throws FieldNotFound {
        quickfix.field.Username value = new quickfix.field.Username();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.Username field) {
        return isSetField(field);
    }

    public boolean isSetUsername() {
        return isSetField(553);
    }

    public void set(quickfix.field.Password value) {
        setField(value);
    }

    public quickfix.field.Password get(quickfix.field.Password value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.Password getPassword() throws FieldNotFound {
        quickfix.field.Password value = new quickfix.field.Password();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.Password field) {
        return isSetField(field);
    }

    public boolean isSetPassword() {
        return isSetField(554);
    }

    public void set(quickfix.field.NewPassword value) {
        setField(value);
    }

    public quickfix.field.NewPassword get(quickfix.field.NewPassword value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NewPassword getNewPassword()
        throws FieldNotFound {
        quickfix.field.NewPassword value = new quickfix.field.NewPassword();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NewPassword field) {
        return isSetField(field);
    }

    public boolean isSetNewPassword() {
        return isSetField(925);
    }

    public void set(quickfix.field.EncryptedPasswordMethod value) {
        setField(value);
    }

    public quickfix.field.EncryptedPasswordMethod get(
        quickfix.field.EncryptedPasswordMethod value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncryptedPasswordMethod getEncryptedPasswordMethod()
        throws FieldNotFound {
        quickfix.field.EncryptedPasswordMethod value = new quickfix.field.EncryptedPasswordMethod();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncryptedPasswordMethod field) {
        return isSetField(field);
    }

    public boolean isSetEncryptedPasswordMethod() {
        return isSetField(1400);
    }

    public void set(quickfix.field.EncryptedPasswordLen value) {
        setField(value);
    }

    public quickfix.field.EncryptedPasswordLen get(
        quickfix.field.EncryptedPasswordLen value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncryptedPasswordLen getEncryptedPasswordLen()
        throws FieldNotFound {
        quickfix.field.EncryptedPasswordLen value = new quickfix.field.EncryptedPasswordLen();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncryptedPasswordLen field) {
        return isSetField(field);
    }

    public boolean isSetEncryptedPasswordLen() {
        return isSetField(1401);
    }

    public void set(quickfix.field.EncryptedPassword value) {
        setField(value);
    }

    public quickfix.field.EncryptedPassword get(
        quickfix.field.EncryptedPassword value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncryptedPassword getEncryptedPassword()
        throws FieldNotFound {
        quickfix.field.EncryptedPassword value = new quickfix.field.EncryptedPassword();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncryptedPassword field) {
        return isSetField(field);
    }

    public boolean isSetEncryptedPassword() {
        return isSetField(1402);
    }

    public void set(quickfix.field.EncryptedNewPasswordLen value) {
        setField(value);
    }

    public quickfix.field.EncryptedNewPasswordLen get(
        quickfix.field.EncryptedNewPasswordLen value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncryptedNewPasswordLen getEncryptedNewPasswordLen()
        throws FieldNotFound {
        quickfix.field.EncryptedNewPasswordLen value = new quickfix.field.EncryptedNewPasswordLen();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncryptedNewPasswordLen field) {
        return isSetField(field);
    }

    public boolean isSetEncryptedNewPasswordLen() {
        return isSetField(1403);
    }

    public void set(quickfix.field.EncryptedNewPassword value) {
        setField(value);
    }

    public quickfix.field.EncryptedNewPassword get(
        quickfix.field.EncryptedNewPassword value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncryptedNewPassword getEncryptedNewPassword()
        throws FieldNotFound {
        quickfix.field.EncryptedNewPassword value = new quickfix.field.EncryptedNewPassword();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncryptedNewPassword field) {
        return isSetField(field);
    }

    public boolean isSetEncryptedNewPassword() {
        return isSetField(1404);
    }

    public void set(quickfix.field.SessionStatus value) {
        setField(value);
    }

    public quickfix.field.SessionStatus get(quickfix.field.SessionStatus value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.SessionStatus getSessionStatus()
        throws FieldNotFound {
        quickfix.field.SessionStatus value = new quickfix.field.SessionStatus();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.SessionStatus field) {
        return isSetField(field);
    }

    public boolean isSetSessionStatus() {
        return isSetField(1409);
    }

    public void set(quickfix.field.DefaultApplVerID value) {
        setField(value);
    }

    public quickfix.field.DefaultApplVerID get(
        quickfix.field.DefaultApplVerID value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.DefaultApplVerID getDefaultApplVerID()
        throws FieldNotFound {
        quickfix.field.DefaultApplVerID value = new quickfix.field.DefaultApplVerID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.DefaultApplVerID field) {
        return isSetField(field);
    }

    public boolean isSetDefaultApplVerID() {
        return isSetField(1137);
    }

    public void set(quickfix.field.DefaultApplExtID value) {
        setField(value);
    }

    public quickfix.field.DefaultApplExtID get(
        quickfix.field.DefaultApplExtID value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.DefaultApplExtID getDefaultApplExtID()
        throws FieldNotFound {
        quickfix.field.DefaultApplExtID value = new quickfix.field.DefaultApplExtID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.DefaultApplExtID field) {
        return isSetField(field);
    }

    public boolean isSetDefaultApplExtID() {
        return isSetField(1407);
    }

    public void set(quickfix.field.DefaultCstmApplVerID value) {
        setField(value);
    }

    public quickfix.field.DefaultCstmApplVerID get(
        quickfix.field.DefaultCstmApplVerID value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.DefaultCstmApplVerID getDefaultCstmApplVerID()
        throws FieldNotFound {
        quickfix.field.DefaultCstmApplVerID value = new quickfix.field.DefaultCstmApplVerID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.DefaultCstmApplVerID field) {
        return isSetField(field);
    }

    public boolean isSetDefaultCstmApplVerID() {
        return isSetField(1408);
    }

    public void set(quickfix.field.Text value) {
        setField(value);
    }

    public quickfix.field.Text get(quickfix.field.Text value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.Text getText() throws FieldNotFound {
        quickfix.field.Text value = new quickfix.field.Text();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.Text field) {
        return isSetField(field);
    }

    public boolean isSetText() {
        return isSetField(58);
    }

    public void set(quickfix.field.EncodedTextLen value) {
        setField(value);
    }

    public quickfix.field.EncodedTextLen get(
        quickfix.field.EncodedTextLen value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncodedTextLen getEncodedTextLen()
        throws FieldNotFound {
        quickfix.field.EncodedTextLen value = new quickfix.field.EncodedTextLen();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncodedTextLen field) {
        return isSetField(field);
    }

    public boolean isSetEncodedTextLen() {
        return isSetField(354);
    }

    public void set(quickfix.field.EncodedText value) {
        setField(value);
    }

    public quickfix.field.EncodedText get(quickfix.field.EncodedText value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.EncodedText getEncodedText()
        throws FieldNotFound {
        quickfix.field.EncodedText value = new quickfix.field.EncodedText();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.EncodedText field) {
        return isSetField(field);
    }

    public boolean isSetEncodedText() {
        return isSetField(355);
    }

    public static class NoMsgTypes extends Group {
        static final long serialVersionUID = 20050617;

        public NoMsgTypes() {
            super(384, 372, new int[] { 372, 385, 1130, 1406, 1131, 1410, 0 });
        }

        public void set(quickfix.field.RefMsgType value) {
            setField(value);
        }

        public quickfix.field.RefMsgType get(quickfix.field.RefMsgType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RefMsgType getRefMsgType()
            throws FieldNotFound {
            quickfix.field.RefMsgType value = new quickfix.field.RefMsgType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RefMsgType field) {
            return isSetField(field);
        }

        public boolean isSetRefMsgType() {
            return isSetField(372);
        }

        public void set(quickfix.field.MsgDirection value) {
            setField(value);
        }

        public quickfix.field.MsgDirection get(
            quickfix.field.MsgDirection value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MsgDirection getMsgDirection()
            throws FieldNotFound {
            quickfix.field.MsgDirection value = new quickfix.field.MsgDirection();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MsgDirection field) {
            return isSetField(field);
        }

        public boolean isSetMsgDirection() {
            return isSetField(385);
        }

        public void set(quickfix.field.RefApplVerID value) {
            setField(value);
        }

        public quickfix.field.RefApplVerID get(
            quickfix.field.RefApplVerID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RefApplVerID getRefApplVerID()
            throws FieldNotFound {
            quickfix.field.RefApplVerID value = new quickfix.field.RefApplVerID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RefApplVerID field) {
            return isSetField(field);
        }

        public boolean isSetRefApplVerID() {
            return isSetField(1130);
        }

        public void set(quickfix.field.RefApplExtID value) {
            setField(value);
        }

        public quickfix.field.RefApplExtID get(
            quickfix.field.RefApplExtID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RefApplExtID getRefApplExtID()
            throws FieldNotFound {
            quickfix.field.RefApplExtID value = new quickfix.field.RefApplExtID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RefApplExtID field) {
            return isSetField(field);
        }

        public boolean isSetRefApplExtID() {
            return isSetField(1406);
        }

        public void set(quickfix.field.RefCstmApplVerID value) {
            setField(value);
        }

        public quickfix.field.RefCstmApplVerID get(
            quickfix.field.RefCstmApplVerID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RefCstmApplVerID getRefCstmApplVerID()
            throws FieldNotFound {
            quickfix.field.RefCstmApplVerID value = new quickfix.field.RefCstmApplVerID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RefCstmApplVerID field) {
            return isSetField(field);
        }

        public boolean isSetRefCstmApplVerID() {
            return isSetField(1131);
        }

        public void set(quickfix.field.DefaultVerIndicator value) {
            setField(value);
        }

        public quickfix.field.DefaultVerIndicator get(
            quickfix.field.DefaultVerIndicator value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DefaultVerIndicator getDefaultVerIndicator()
            throws FieldNotFound {
            quickfix.field.DefaultVerIndicator value = new quickfix.field.DefaultVerIndicator();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DefaultVerIndicator field) {
            return isSetField(field);
        }

        public boolean isSetDefaultVerIndicator() {
            return isSetField(1410);
        }
    }
}
