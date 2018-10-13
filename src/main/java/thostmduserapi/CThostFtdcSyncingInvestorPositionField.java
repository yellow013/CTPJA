package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\ufffd\ufffd\ufffd\u036c\ufffd\ufffd\ufffd\u0435\ufffd\u0376\ufffd\ufffd\ufffd\u07f3\u05b2\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:1866</i><br>
 * This file was autogenerated by
 * <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that
 * <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a
 * few opensource projects.</a>.<br>
 * For help, please visit
 * <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or
 * <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi")
public class CThostFtdcSyncingInvestorPositionField extends StructObject {
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({ 31 })
	@Field(0)
	public Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 0);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({ 11 })
	@Field(1)
	public Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 1);
	}

	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({ 13 })
	@Field(2)
	public Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 2);
	}

	/**
	 * \ufffd\u05b2\u05b6\ufffd\u0577\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(3)
	public byte PosiDirection() {
		return this.io.getByteField(this, 3);
	}

	/**
	 * \ufffd\u05b2\u05b6\ufffd\u0577\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(3)
	public CThostFtdcSyncingInvestorPositionField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 3, PosiDirection);
		return this;
	}

	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4)
	public byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}

	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4)
	public CThostFtdcSyncingInvestorPositionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}

	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateType
	 */
	@Field(5)
	public byte PositionDate() {
		return this.io.getByteField(this, 5);
	}

	/**
	 * \ufffd\u05b2\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPositionDateType
	 */
	@Field(5)
	public CThostFtdcSyncingInvestorPositionField PositionDate(byte PositionDate) {
		this.io.setByteField(this, 5, PositionDate);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6)
	public int YdPosition() {
		return this.io.getIntField(this, 6);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6)
	public CThostFtdcSyncingInvestorPositionField YdPosition(int YdPosition) {
		this.io.setIntField(this, 6, YdPosition);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7)
	public int Position() {
		return this.io.getIntField(this, 7);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(7)
	public CThostFtdcSyncingInvestorPositionField Position(int Position) {
		this.io.setIntField(this, 7, Position);
		return this;
	}

	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8)
	public int LongFrozen() {
		return this.io.getIntField(this, 8);
	}

	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(8)
	public CThostFtdcSyncingInvestorPositionField LongFrozen(int LongFrozen) {
		this.io.setIntField(this, 8, LongFrozen);
		return this;
	}

	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9)
	public int ShortFrozen() {
		return this.io.getIntField(this, 9);
	}

	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9)
	public CThostFtdcSyncingInvestorPositionField ShortFrozen(int ShortFrozen) {
		this.io.setIntField(this, 9, ShortFrozen);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10)
	public double LongFrozenAmount() {
		return this.io.getDoubleField(this, 10);
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(10)
	public CThostFtdcSyncingInvestorPositionField LongFrozenAmount(double LongFrozenAmount) {
		this.io.setDoubleField(this, 10, LongFrozenAmount);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11)
	public double ShortFrozenAmount() {
		return this.io.getDoubleField(this, 11);
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b6\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(11)
	public CThostFtdcSyncingInvestorPositionField ShortFrozenAmount(double ShortFrozenAmount) {
		this.io.setDoubleField(this, 11, ShortFrozenAmount);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(12)
	public int OpenVolume() {
		return this.io.getIntField(this, 12);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(12)
	public CThostFtdcSyncingInvestorPositionField OpenVolume(int OpenVolume) {
		this.io.setIntField(this, 12, OpenVolume);
		return this;
	}

	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(13)
	public int CloseVolume() {
		return this.io.getIntField(this, 13);
	}

	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(13)
	public CThostFtdcSyncingInvestorPositionField CloseVolume(int CloseVolume) {
		this.io.setIntField(this, 13, CloseVolume);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14)
	public double OpenAmount() {
		return this.io.getDoubleField(this, 14);
	}

	/**
	 * \ufffd\ufffd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(14)
	public CThostFtdcSyncingInvestorPositionField OpenAmount(double OpenAmount) {
		this.io.setDoubleField(this, 14, OpenAmount);
		return this;
	}

	/**
	 * \u01bd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15)
	public double CloseAmount() {
		return this.io.getDoubleField(this, 15);
	}

	/**
	 * \u01bd\ufffd\u05bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(15)
	public CThostFtdcSyncingInvestorPositionField CloseAmount(double CloseAmount) {
		this.io.setDoubleField(this, 15, CloseAmount);
		return this;
	}

	/**
	 * \ufffd\u05b2\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16)
	public double PositionCost() {
		return this.io.getDoubleField(this, 16);
	}

	/**
	 * \ufffd\u05b2\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(16)
	public CThostFtdcSyncingInvestorPositionField PositionCost(double PositionCost) {
		this.io.setDoubleField(this, 16, PositionCost);
		return this;
	}

	/**
	 * \ufffd\u03f4\ufffd\u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17)
	public double PreMargin() {
		return this.io.getDoubleField(this, 17);
	}

	/**
	 * \ufffd\u03f4\ufffd\u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(17)
	public CThostFtdcSyncingInvestorPositionField PreMargin(double PreMargin) {
		this.io.setDoubleField(this, 17, PreMargin);
		return this;
	}

	/**
	 * \u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18)
	public double UseMargin() {
		return this.io.getDoubleField(this, 18);
	}

	/**
	 * \u057c\ufffd\u00f5\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(18)
	public CThostFtdcSyncingInvestorPositionField UseMargin(double UseMargin) {
		this.io.setDoubleField(this, 18, UseMargin);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19)
	public double FrozenMargin() {
		return this.io.getDoubleField(this, 19);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\u0131\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(19)
	public CThostFtdcSyncingInvestorPositionField FrozenMargin(double FrozenMargin) {
		this.io.setDoubleField(this, 19, FrozenMargin);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20)
	public double FrozenCash() {
		return this.io.getDoubleField(this, 20);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02bd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(20)
	public CThostFtdcSyncingInvestorPositionField FrozenCash(double FrozenCash) {
		this.io.setDoubleField(this, 20, FrozenCash);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21)
	public double FrozenCommission() {
		return this.io.getDoubleField(this, 21);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(21)
	public CThostFtdcSyncingInvestorPositionField FrozenCommission(double FrozenCommission) {
		this.io.setDoubleField(this, 21, FrozenCommission);
		return this;
	}

	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22)
	public double CashIn() {
		return this.io.getDoubleField(this, 22);
	}

	/**
	 * \ufffd\u02bd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(22)
	public CThostFtdcSyncingInvestorPositionField CashIn(double CashIn) {
		this.io.setDoubleField(this, 22, CashIn);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(23)
	public double Commission() {
		return this.io.getDoubleField(this, 23);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(23)
	public CThostFtdcSyncingInvestorPositionField Commission(double Commission) {
		this.io.setDoubleField(this, 23, Commission);
		return this;
	}

	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(24)
	public double CloseProfit() {
		return this.io.getDoubleField(this, 24);
	}

	/**
	 * \u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(24)
	public CThostFtdcSyncingInvestorPositionField CloseProfit(double CloseProfit) {
		this.io.setDoubleField(this, 24, CloseProfit);
		return this;
	}

	/**
	 * \ufffd\u05b2\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25)
	public double PositionProfit() {
		return this.io.getDoubleField(this, 25);
	}

	/**
	 * \ufffd\u05b2\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(25)
	public CThostFtdcSyncingInvestorPositionField PositionProfit(double PositionProfit) {
		this.io.setDoubleField(this, 25, PositionProfit);
		return this;
	}

	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(26)
	public double PreSettlementPrice() {
		return this.io.getDoubleField(this, 26);
	}

	/**
	 * \ufffd\u03f4\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(26)
	public CThostFtdcSyncingInvestorPositionField PreSettlementPrice(double PreSettlementPrice) {
		this.io.setDoubleField(this, 26, PreSettlementPrice);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27)
	public double SettlementPrice() {
		return this.io.getDoubleField(this, 27);
	}

	/**
	 * \ufffd\ufffd\ufffd\u03bd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(27)
	public CThostFtdcSyncingInvestorPositionField SettlementPrice(double SettlementPrice) {
		this.io.setDoubleField(this, 27, SettlementPrice);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({ 9 })
	@Field(28)
	public Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 28);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(29)
	public int SettlementID() {
		return this.io.getIntField(this, 29);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(29)
	public CThostFtdcSyncingInvestorPositionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 29, SettlementID);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(30)
	public double OpenCost() {
		return this.io.getDoubleField(this, 30);
	}

	/**
	 * \ufffd\ufffd\ufffd\u05b3\u0271\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(30)
	public CThostFtdcSyncingInvestorPositionField OpenCost(double OpenCost) {
		this.io.setDoubleField(this, 30, OpenCost);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(31)
	public double ExchangeMargin() {
		return this.io.getDoubleField(this, 31);
	}

	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05a4\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(31)
	public CThostFtdcSyncingInvestorPositionField ExchangeMargin(double ExchangeMargin) {
		this.io.setDoubleField(this, 31, ExchangeMargin);
		return this;
	}

	/**
	 * \ufffd\ufffd\u03f3\u027d\ufffd\ufffd\u03b3\u0275\u0133\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32)
	public int CombPosition() {
		return this.io.getIntField(this, 32);
	}

	/**
	 * \ufffd\ufffd\u03f3\u027d\ufffd\ufffd\u03b3\u0275\u0133\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32)
	public CThostFtdcSyncingInvestorPositionField CombPosition(int CombPosition) {
		this.io.setIntField(this, 32, CombPosition);
		return this;
	}

	/**
	 * \ufffd\ufffd\u03f6\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(33)
	public int CombLongFrozen() {
		return this.io.getIntField(this, 33);
	}

	/**
	 * \ufffd\ufffd\u03f6\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(33)
	public CThostFtdcSyncingInvestorPositionField CombLongFrozen(int CombLongFrozen) {
		this.io.setIntField(this, 33, CombLongFrozen);
		return this;
	}

	/**
	 * \ufffd\ufffd\u03ff\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(34)
	public int CombShortFrozen() {
		return this.io.getIntField(this, 34);
	}

	/**
	 * \ufffd\ufffd\u03ff\ufffd\u0377\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(34)
	public CThostFtdcSyncingInvestorPositionField CombShortFrozen(int CombShortFrozen) {
		this.io.setIntField(this, 34, CombShortFrozen);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0576\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(35)
	public double CloseProfitByDate() {
		return this.io.getDoubleField(this, 35);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0576\ufffd\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(35)
	public CThostFtdcSyncingInvestorPositionField CloseProfitByDate(double CloseProfitByDate) {
		this.io.setDoubleField(this, 35, CloseProfitByDate);
		return this;
	}

	/**
	 * \ufffd\ufffd\u02b6\u0533\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(36)
	public double CloseProfitByTrade() {
		return this.io.getDoubleField(this, 36);
	}

	/**
	 * \ufffd\ufffd\u02b6\u0533\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(36)
	public CThostFtdcSyncingInvestorPositionField CloseProfitByTrade(double CloseProfitByTrade) {
		this.io.setDoubleField(this, 36, CloseProfitByTrade);
		return this;
	}

	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(37)
	public int TodayPosition() {
		return this.io.getIntField(this, 37);
	}

	/**
	 * \ufffd\ufffd\ufffd\u0573\u05b2\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(37)
	public CThostFtdcSyncingInvestorPositionField TodayPosition(int TodayPosition) {
		this.io.setIntField(this, 37, TodayPosition);
		return this;
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(38)
	public double MarginRateByMoney() {
		return this.io.getDoubleField(this, 38);
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(38)
	public CThostFtdcSyncingInvestorPositionField MarginRateByMoney(double MarginRateByMoney) {
		this.io.setDoubleField(this, 38, MarginRateByMoney);
		return this;
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(39)
	public double MarginRateByVolume() {
		return this.io.getDoubleField(this, 39);
	}

	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(39)
	public CThostFtdcSyncingInvestorPositionField MarginRateByVolume(double MarginRateByVolume) {
		this.io.setDoubleField(this, 39, MarginRateByVolume);
		return this;
	}

	public CThostFtdcSyncingInvestorPositionField() {
		super();
	}

	public CThostFtdcSyncingInvestorPositionField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
