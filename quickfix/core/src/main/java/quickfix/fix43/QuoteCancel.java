package quickfix.fix43;

import quickfix.FieldNotFound;
import quickfix.Group;


public class QuoteCancel extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "Z";

    public QuoteCancel() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public QuoteCancel(quickfix.field.QuoteID quoteID,
        quickfix.field.QuoteCancelType quoteCancelType) {
        this();
        setField(quoteID);
        setField(quoteCancelType);
    }

    public void set(quickfix.field.QuoteReqID value) {
        setField(value);
    }

    public quickfix.field.QuoteReqID get(quickfix.field.QuoteReqID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteReqID getQuoteReqID() throws FieldNotFound {
        quickfix.field.QuoteReqID value = new quickfix.field.QuoteReqID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteReqID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteReqID() {
        return isSetField(131);
    }

    public void set(quickfix.field.QuoteID value) {
        setField(value);
    }

    public quickfix.field.QuoteID get(quickfix.field.QuoteID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteID getQuoteID() throws FieldNotFound {
        quickfix.field.QuoteID value = new quickfix.field.QuoteID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteID field) {
        return isSetField(field);
    }

    public boolean isSetQuoteID() {
        return isSetField(117);
    }

    public void set(quickfix.field.QuoteCancelType value) {
        setField(value);
    }

    public quickfix.field.QuoteCancelType get(
        quickfix.field.QuoteCancelType value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteCancelType getQuoteCancelType()
        throws FieldNotFound {
        quickfix.field.QuoteCancelType value = new quickfix.field.QuoteCancelType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteCancelType field) {
        return isSetField(field);
    }

    public boolean isSetQuoteCancelType() {
        return isSetField(298);
    }

    public void set(quickfix.field.QuoteResponseLevel value) {
        setField(value);
    }

    public quickfix.field.QuoteResponseLevel get(
        quickfix.field.QuoteResponseLevel value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.QuoteResponseLevel getQuoteResponseLevel()
        throws FieldNotFound {
        quickfix.field.QuoteResponseLevel value = new quickfix.field.QuoteResponseLevel();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.QuoteResponseLevel field) {
        return isSetField(field);
    }

    public boolean isSetQuoteResponseLevel() {
        return isSetField(301);
    }

    public void set(quickfix.fix43.component.Parties component) {
        setComponent(component);
    }

    public quickfix.fix43.component.Parties get(
        quickfix.fix43.component.Parties component) throws FieldNotFound {
        getComponent(component);

        return component;
    }

    public quickfix.fix43.component.Parties getParties()
        throws FieldNotFound {
        quickfix.fix43.component.Parties component = new quickfix.fix43.component.Parties();
        getComponent(component);

        return component;
    }

    public void set(quickfix.field.NoPartyIDs value) {
        setField(value);
    }

    public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
        quickfix.field.NoPartyIDs value = new quickfix.field.NoPartyIDs();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoPartyIDs field) {
        return isSetField(field);
    }

    public boolean isSetNoPartyIDs() {
        return isSetField(453);
    }

    public void set(quickfix.field.Account value) {
        setField(value);
    }

    public quickfix.field.Account get(quickfix.field.Account value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.Account getAccount() throws FieldNotFound {
        quickfix.field.Account value = new quickfix.field.Account();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.Account field) {
        return isSetField(field);
    }

    public boolean isSetAccount() {
        return isSetField(1);
    }

    public void set(quickfix.field.AccountType value) {
        setField(value);
    }

    public quickfix.field.AccountType get(quickfix.field.AccountType value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.AccountType getAccountType()
        throws FieldNotFound {
        quickfix.field.AccountType value = new quickfix.field.AccountType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.AccountType field) {
        return isSetField(field);
    }

    public boolean isSetAccountType() {
        return isSetField(581);
    }

    public void set(quickfix.field.TradingSessionID value) {
        setField(value);
    }

    public quickfix.field.TradingSessionID get(
        quickfix.field.TradingSessionID value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.TradingSessionID getTradingSessionID()
        throws FieldNotFound {
        quickfix.field.TradingSessionID value = new quickfix.field.TradingSessionID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.TradingSessionID field) {
        return isSetField(field);
    }

    public boolean isSetTradingSessionID() {
        return isSetField(336);
    }

    public void set(quickfix.field.TradingSessionSubID value) {
        setField(value);
    }

    public quickfix.field.TradingSessionSubID get(
        quickfix.field.TradingSessionSubID value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.TradingSessionSubID getTradingSessionSubID()
        throws FieldNotFound {
        quickfix.field.TradingSessionSubID value = new quickfix.field.TradingSessionSubID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.TradingSessionSubID field) {
        return isSetField(field);
    }

    public boolean isSetTradingSessionSubID() {
        return isSetField(625);
    }

    public void set(quickfix.field.NoQuoteEntries value) {
        setField(value);
    }

    public quickfix.field.NoQuoteEntries get(
        quickfix.field.NoQuoteEntries value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoQuoteEntries getNoQuoteEntries()
        throws FieldNotFound {
        quickfix.field.NoQuoteEntries value = new quickfix.field.NoQuoteEntries();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoQuoteEntries field) {
        return isSetField(field);
    }

    public boolean isSetNoQuoteEntries() {
        return isSetField(295);
    }

    public static class NoPartyIDs extends Group {
        static final long serialVersionUID = 20050617;

        public NoPartyIDs() {
            super(453, 448, new int[] { 448, 447, 452, 523, 0 });
        }

        public void set(quickfix.field.PartyID value) {
            setField(value);
        }

        public quickfix.field.PartyID get(quickfix.field.PartyID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartyID getPartyID() throws FieldNotFound {
            quickfix.field.PartyID value = new quickfix.field.PartyID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartyID field) {
            return isSetField(field);
        }

        public boolean isSetPartyID() {
            return isSetField(448);
        }

        public void set(quickfix.field.PartyIDSource value) {
            setField(value);
        }

        public quickfix.field.PartyIDSource get(
            quickfix.field.PartyIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartyIDSource getPartyIDSource()
            throws FieldNotFound {
            quickfix.field.PartyIDSource value = new quickfix.field.PartyIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartyIDSource field) {
            return isSetField(field);
        }

        public boolean isSetPartyIDSource() {
            return isSetField(447);
        }

        public void set(quickfix.field.PartyRole value) {
            setField(value);
        }

        public quickfix.field.PartyRole get(quickfix.field.PartyRole value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartyRole getPartyRole()
            throws FieldNotFound {
            quickfix.field.PartyRole value = new quickfix.field.PartyRole();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartyRole field) {
            return isSetField(field);
        }

        public boolean isSetPartyRole() {
            return isSetField(452);
        }

        public void set(quickfix.field.PartySubID value) {
            setField(value);
        }

        public quickfix.field.PartySubID get(quickfix.field.PartySubID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.PartySubID getPartySubID()
            throws FieldNotFound {
            quickfix.field.PartySubID value = new quickfix.field.PartySubID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.PartySubID field) {
            return isSetField(field);
        }

        public boolean isSetPartySubID() {
            return isSetField(523);
        }
    }

    public static class NoQuoteEntries extends Group {
        static final long serialVersionUID = 20050617;

        public NoQuoteEntries() {
            super(295, 55,
                new int[] {
                    55, 65, 48, 22, 454, 460, 461, 167, 200, 541, 224, 225, 239,
                    226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 206, 231,
                    223, 207, 106, 348, 349, 107, 350, 351, 0
                });
        }

        public void set(quickfix.fix43.component.Instrument component) {
            setComponent(component);
        }

        public quickfix.fix43.component.Instrument get(
            quickfix.fix43.component.Instrument component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix43.component.Instrument getInstrument()
            throws FieldNotFound {
            quickfix.fix43.component.Instrument component = new quickfix.fix43.component.Instrument();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.Symbol value) {
            setField(value);
        }

        public quickfix.field.Symbol get(quickfix.field.Symbol value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Symbol getSymbol() throws FieldNotFound {
            quickfix.field.Symbol value = new quickfix.field.Symbol();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Symbol field) {
            return isSetField(field);
        }

        public boolean isSetSymbol() {
            return isSetField(55);
        }

        public void set(quickfix.field.SymbolSfx value) {
            setField(value);
        }

        public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SymbolSfx getSymbolSfx()
            throws FieldNotFound {
            quickfix.field.SymbolSfx value = new quickfix.field.SymbolSfx();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SymbolSfx field) {
            return isSetField(field);
        }

        public boolean isSetSymbolSfx() {
            return isSetField(65);
        }

        public void set(quickfix.field.SecurityID value) {
            setField(value);
        }

        public quickfix.field.SecurityID get(quickfix.field.SecurityID value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityID getSecurityID()
            throws FieldNotFound {
            quickfix.field.SecurityID value = new quickfix.field.SecurityID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityID field) {
            return isSetField(field);
        }

        public boolean isSetSecurityID() {
            return isSetField(48);
        }

        public void set(quickfix.field.SecurityIDSource value) {
            setField(value);
        }

        public quickfix.field.SecurityIDSource get(
            quickfix.field.SecurityIDSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityIDSource getSecurityIDSource()
            throws FieldNotFound {
            quickfix.field.SecurityIDSource value = new quickfix.field.SecurityIDSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityIDSource field) {
            return isSetField(field);
        }

        public boolean isSetSecurityIDSource() {
            return isSetField(22);
        }

        public void set(quickfix.field.NoSecurityAltID value) {
            setField(value);
        }

        public quickfix.field.NoSecurityAltID get(
            quickfix.field.NoSecurityAltID value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoSecurityAltID getNoSecurityAltID()
            throws FieldNotFound {
            quickfix.field.NoSecurityAltID value = new quickfix.field.NoSecurityAltID();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoSecurityAltID field) {
            return isSetField(field);
        }

        public boolean isSetNoSecurityAltID() {
            return isSetField(454);
        }

        public void set(quickfix.field.Product value) {
            setField(value);
        }

        public quickfix.field.Product get(quickfix.field.Product value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Product getProduct() throws FieldNotFound {
            quickfix.field.Product value = new quickfix.field.Product();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Product field) {
            return isSetField(field);
        }

        public boolean isSetProduct() {
            return isSetField(460);
        }

        public void set(quickfix.field.CFICode value) {
            setField(value);
        }

        public quickfix.field.CFICode get(quickfix.field.CFICode value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CFICode getCFICode() throws FieldNotFound {
            quickfix.field.CFICode value = new quickfix.field.CFICode();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CFICode field) {
            return isSetField(field);
        }

        public boolean isSetCFICode() {
            return isSetField(461);
        }

        public void set(quickfix.field.SecurityType value) {
            setField(value);
        }

        public quickfix.field.SecurityType get(
            quickfix.field.SecurityType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityType getSecurityType()
            throws FieldNotFound {
            quickfix.field.SecurityType value = new quickfix.field.SecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityType field) {
            return isSetField(field);
        }

        public boolean isSetSecurityType() {
            return isSetField(167);
        }

        public void set(quickfix.field.MaturityMonthYear value) {
            setField(value);
        }

        public quickfix.field.MaturityMonthYear get(
            quickfix.field.MaturityMonthYear value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityMonthYear getMaturityMonthYear()
            throws FieldNotFound {
            quickfix.field.MaturityMonthYear value = new quickfix.field.MaturityMonthYear();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityMonthYear field) {
            return isSetField(field);
        }

        public boolean isSetMaturityMonthYear() {
            return isSetField(200);
        }

        public void set(quickfix.field.MaturityDate value) {
            setField(value);
        }

        public quickfix.field.MaturityDate get(
            quickfix.field.MaturityDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.MaturityDate getMaturityDate()
            throws FieldNotFound {
            quickfix.field.MaturityDate value = new quickfix.field.MaturityDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.MaturityDate field) {
            return isSetField(field);
        }

        public boolean isSetMaturityDate() {
            return isSetField(541);
        }

        public void set(quickfix.field.CouponPaymentDate value) {
            setField(value);
        }

        public quickfix.field.CouponPaymentDate get(
            quickfix.field.CouponPaymentDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CouponPaymentDate getCouponPaymentDate()
            throws FieldNotFound {
            quickfix.field.CouponPaymentDate value = new quickfix.field.CouponPaymentDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CouponPaymentDate field) {
            return isSetField(field);
        }

        public boolean isSetCouponPaymentDate() {
            return isSetField(224);
        }

        public void set(quickfix.field.IssueDate value) {
            setField(value);
        }

        public quickfix.field.IssueDate get(quickfix.field.IssueDate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.IssueDate getIssueDate()
            throws FieldNotFound {
            quickfix.field.IssueDate value = new quickfix.field.IssueDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.IssueDate field) {
            return isSetField(field);
        }

        public boolean isSetIssueDate() {
            return isSetField(225);
        }

        public void set(quickfix.field.RepoCollateralSecurityType value) {
            setField(value);
        }

        public quickfix.field.RepoCollateralSecurityType get(
            quickfix.field.RepoCollateralSecurityType value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType()
            throws FieldNotFound {
            quickfix.field.RepoCollateralSecurityType value = new quickfix.field.RepoCollateralSecurityType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
            return isSetField(field);
        }

        public boolean isSetRepoCollateralSecurityType() {
            return isSetField(239);
        }

        public void set(quickfix.field.RepurchaseTerm value) {
            setField(value);
        }

        public quickfix.field.RepurchaseTerm get(
            quickfix.field.RepurchaseTerm value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RepurchaseTerm getRepurchaseTerm()
            throws FieldNotFound {
            quickfix.field.RepurchaseTerm value = new quickfix.field.RepurchaseTerm();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RepurchaseTerm field) {
            return isSetField(field);
        }

        public boolean isSetRepurchaseTerm() {
            return isSetField(226);
        }

        public void set(quickfix.field.RepurchaseRate value) {
            setField(value);
        }

        public quickfix.field.RepurchaseRate get(
            quickfix.field.RepurchaseRate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RepurchaseRate getRepurchaseRate()
            throws FieldNotFound {
            quickfix.field.RepurchaseRate value = new quickfix.field.RepurchaseRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RepurchaseRate field) {
            return isSetField(field);
        }

        public boolean isSetRepurchaseRate() {
            return isSetField(227);
        }

        public void set(quickfix.field.Factor value) {
            setField(value);
        }

        public quickfix.field.Factor get(quickfix.field.Factor value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Factor getFactor() throws FieldNotFound {
            quickfix.field.Factor value = new quickfix.field.Factor();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Factor field) {
            return isSetField(field);
        }

        public boolean isSetFactor() {
            return isSetField(228);
        }

        public void set(quickfix.field.CreditRating value) {
            setField(value);
        }

        public quickfix.field.CreditRating get(
            quickfix.field.CreditRating value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CreditRating getCreditRating()
            throws FieldNotFound {
            quickfix.field.CreditRating value = new quickfix.field.CreditRating();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CreditRating field) {
            return isSetField(field);
        }

        public boolean isSetCreditRating() {
            return isSetField(255);
        }

        public void set(quickfix.field.InstrRegistry value) {
            setField(value);
        }

        public quickfix.field.InstrRegistry get(
            quickfix.field.InstrRegistry value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.InstrRegistry getInstrRegistry()
            throws FieldNotFound {
            quickfix.field.InstrRegistry value = new quickfix.field.InstrRegistry();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.InstrRegistry field) {
            return isSetField(field);
        }

        public boolean isSetInstrRegistry() {
            return isSetField(543);
        }

        public void set(quickfix.field.CountryOfIssue value) {
            setField(value);
        }

        public quickfix.field.CountryOfIssue get(
            quickfix.field.CountryOfIssue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CountryOfIssue getCountryOfIssue()
            throws FieldNotFound {
            quickfix.field.CountryOfIssue value = new quickfix.field.CountryOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CountryOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetCountryOfIssue() {
            return isSetField(470);
        }

        public void set(quickfix.field.StateOrProvinceOfIssue value) {
            setField(value);
        }

        public quickfix.field.StateOrProvinceOfIssue get(
            quickfix.field.StateOrProvinceOfIssue value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue()
            throws FieldNotFound {
            quickfix.field.StateOrProvinceOfIssue value = new quickfix.field.StateOrProvinceOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetStateOrProvinceOfIssue() {
            return isSetField(471);
        }

        public void set(quickfix.field.LocaleOfIssue value) {
            setField(value);
        }

        public quickfix.field.LocaleOfIssue get(
            quickfix.field.LocaleOfIssue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LocaleOfIssue getLocaleOfIssue()
            throws FieldNotFound {
            quickfix.field.LocaleOfIssue value = new quickfix.field.LocaleOfIssue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LocaleOfIssue field) {
            return isSetField(field);
        }

        public boolean isSetLocaleOfIssue() {
            return isSetField(472);
        }

        public void set(quickfix.field.RedemptionDate value) {
            setField(value);
        }

        public quickfix.field.RedemptionDate get(
            quickfix.field.RedemptionDate value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.RedemptionDate getRedemptionDate()
            throws FieldNotFound {
            quickfix.field.RedemptionDate value = new quickfix.field.RedemptionDate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.RedemptionDate field) {
            return isSetField(field);
        }

        public boolean isSetRedemptionDate() {
            return isSetField(240);
        }

        public void set(quickfix.field.StrikePrice value) {
            setField(value);
        }

        public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.StrikePrice getStrikePrice()
            throws FieldNotFound {
            quickfix.field.StrikePrice value = new quickfix.field.StrikePrice();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.StrikePrice field) {
            return isSetField(field);
        }

        public boolean isSetStrikePrice() {
            return isSetField(202);
        }

        public void set(quickfix.field.OptAttribute value) {
            setField(value);
        }

        public quickfix.field.OptAttribute get(
            quickfix.field.OptAttribute value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OptAttribute getOptAttribute()
            throws FieldNotFound {
            quickfix.field.OptAttribute value = new quickfix.field.OptAttribute();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OptAttribute field) {
            return isSetField(field);
        }

        public boolean isSetOptAttribute() {
            return isSetField(206);
        }

        public void set(quickfix.field.ContractMultiplier value) {
            setField(value);
        }

        public quickfix.field.ContractMultiplier get(
            quickfix.field.ContractMultiplier value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ContractMultiplier getContractMultiplier()
            throws FieldNotFound {
            quickfix.field.ContractMultiplier value = new quickfix.field.ContractMultiplier();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ContractMultiplier field) {
            return isSetField(field);
        }

        public boolean isSetContractMultiplier() {
            return isSetField(231);
        }

        public void set(quickfix.field.CouponRate value) {
            setField(value);
        }

        public quickfix.field.CouponRate get(quickfix.field.CouponRate value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.CouponRate getCouponRate()
            throws FieldNotFound {
            quickfix.field.CouponRate value = new quickfix.field.CouponRate();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.CouponRate field) {
            return isSetField(field);
        }

        public boolean isSetCouponRate() {
            return isSetField(223);
        }

        public void set(quickfix.field.SecurityExchange value) {
            setField(value);
        }

        public quickfix.field.SecurityExchange get(
            quickfix.field.SecurityExchange value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityExchange getSecurityExchange()
            throws FieldNotFound {
            quickfix.field.SecurityExchange value = new quickfix.field.SecurityExchange();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityExchange field) {
            return isSetField(field);
        }

        public boolean isSetSecurityExchange() {
            return isSetField(207);
        }

        public void set(quickfix.field.Issuer value) {
            setField(value);
        }

        public quickfix.field.Issuer get(quickfix.field.Issuer value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.Issuer getIssuer() throws FieldNotFound {
            quickfix.field.Issuer value = new quickfix.field.Issuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.Issuer field) {
            return isSetField(field);
        }

        public boolean isSetIssuer() {
            return isSetField(106);
        }

        public void set(quickfix.field.EncodedIssuerLen value) {
            setField(value);
        }

        public quickfix.field.EncodedIssuerLen get(
            quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedIssuerLen getEncodedIssuerLen()
            throws FieldNotFound {
            quickfix.field.EncodedIssuerLen value = new quickfix.field.EncodedIssuerLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedIssuerLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedIssuerLen() {
            return isSetField(348);
        }

        public void set(quickfix.field.EncodedIssuer value) {
            setField(value);
        }

        public quickfix.field.EncodedIssuer get(
            quickfix.field.EncodedIssuer value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedIssuer getEncodedIssuer()
            throws FieldNotFound {
            quickfix.field.EncodedIssuer value = new quickfix.field.EncodedIssuer();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedIssuer field) {
            return isSetField(field);
        }

        public boolean isSetEncodedIssuer() {
            return isSetField(349);
        }

        public void set(quickfix.field.SecurityDesc value) {
            setField(value);
        }

        public quickfix.field.SecurityDesc get(
            quickfix.field.SecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SecurityDesc getSecurityDesc()
            throws FieldNotFound {
            quickfix.field.SecurityDesc value = new quickfix.field.SecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetSecurityDesc() {
            return isSetField(107);
        }

        public void set(quickfix.field.EncodedSecurityDescLen value) {
            setField(value);
        }

        public quickfix.field.EncodedSecurityDescLen get(
            quickfix.field.EncodedSecurityDescLen value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen()
            throws FieldNotFound {
            quickfix.field.EncodedSecurityDescLen value = new quickfix.field.EncodedSecurityDescLen();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
            return isSetField(field);
        }

        public boolean isSetEncodedSecurityDescLen() {
            return isSetField(350);
        }

        public void set(quickfix.field.EncodedSecurityDesc value) {
            setField(value);
        }

        public quickfix.field.EncodedSecurityDesc get(
            quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc()
            throws FieldNotFound {
            quickfix.field.EncodedSecurityDesc value = new quickfix.field.EncodedSecurityDesc();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
            return isSetField(field);
        }

        public boolean isSetEncodedSecurityDesc() {
            return isSetField(351);
        }

        public static class NoSecurityAltID extends Group {
            static final long serialVersionUID = 20050617;

            public NoSecurityAltID() {
                super(454, 455, new int[] { 455, 456, 0 });
            }

            public void set(quickfix.field.SecurityAltID value) {
                setField(value);
            }

            public quickfix.field.SecurityAltID get(
                quickfix.field.SecurityAltID value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SecurityAltID getSecurityAltID()
                throws FieldNotFound {
                quickfix.field.SecurityAltID value = new quickfix.field.SecurityAltID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SecurityAltID field) {
                return isSetField(field);
            }

            public boolean isSetSecurityAltID() {
                return isSetField(455);
            }

            public void set(quickfix.field.SecurityAltIDSource value) {
                setField(value);
            }

            public quickfix.field.SecurityAltIDSource get(
                quickfix.field.SecurityAltIDSource value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SecurityAltIDSource getSecurityAltIDSource()
                throws FieldNotFound {
                quickfix.field.SecurityAltIDSource value = new quickfix.field.SecurityAltIDSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SecurityAltIDSource field) {
                return isSetField(field);
            }

            public boolean isSetSecurityAltIDSource() {
                return isSetField(456);
            }
        }
    }
}