package quickfix.fix50;

import quickfix.FieldNotFound;
import quickfix.Group;


public class MarketDataRequestReject extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "Y";

    public MarketDataRequestReject() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public MarketDataRequestReject(quickfix.field.MDReqID mDReqID) {
        this();
        setField(mDReqID);
    }

    public void set(quickfix.field.MDReqID value) {
        setField(value);
    }

    public quickfix.field.MDReqID get(quickfix.field.MDReqID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.MDReqID getMDReqID() throws FieldNotFound {
        quickfix.field.MDReqID value = new quickfix.field.MDReqID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.MDReqID field) {
        return isSetField(field);
    }

    public boolean isSetMDReqID() {
        return isSetField(262);
    }

    public void set(quickfix.field.MDReqRejReason value) {
        setField(value);
    }

    public quickfix.field.MDReqRejReason get(
        quickfix.field.MDReqRejReason value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.MDReqRejReason getMDReqRejReason()
        throws FieldNotFound {
        quickfix.field.MDReqRejReason value = new quickfix.field.MDReqRejReason();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.MDReqRejReason field) {
        return isSetField(field);
    }

    public boolean isSetMDReqRejReason() {
        return isSetField(281);
    }

    public void set(quickfix.fix50.component.MDRjctGrp component) {
        setComponent(component);
    }

    public quickfix.fix50.component.MDRjctGrp get(
        quickfix.fix50.component.MDRjctGrp component) throws FieldNotFound {
        getComponent(component);

        return component;
    }

    public quickfix.fix50.component.MDRjctGrp getMDRjctGrp()
        throws FieldNotFound {
        quickfix.fix50.component.MDRjctGrp component = new quickfix.fix50.component.MDRjctGrp();
        getComponent(component);

        return component;
    }

    public void set(quickfix.field.NoAltMDSource value) {
        setField(value);
    }

    public quickfix.field.NoAltMDSource get(quickfix.field.NoAltMDSource value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoAltMDSource getNoAltMDSource()
        throws FieldNotFound {
        quickfix.field.NoAltMDSource value = new quickfix.field.NoAltMDSource();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoAltMDSource field) {
        return isSetField(field);
    }

    public boolean isSetNoAltMDSource() {
        return isSetField(816);
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

    public static class NoAltMDSource extends Group {
        static final long serialVersionUID = 20050617;

        public NoAltMDSource() {
            super(816, 817, new int[] { 817, 0 });
        }

        public void set(quickfix.field.AltMDSourceID value) {
            setField(value);
        }

        public quickfix.field.AltMDSourceID get(
            quickfix.field.AltMDSourceID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.AltMDSourceID getAltMDSourceID()
            throws FieldNotFound {
            quickfix.field.AltMDSourceID value = new quickfix.field.AltMDSourceID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.AltMDSourceID field) {
            return isSetField(field);
        }

        public boolean isSetAltMDSourceID() {
            return isSetField(817);
        }
    }
}
