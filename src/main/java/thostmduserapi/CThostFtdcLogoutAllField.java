package thostmduserapi;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \ufffd\ufffd\u00bc\ufffd\ufffd\u03e2<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:1086</i><br>
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
public class CThostFtdcLogoutAllField extends StructObject {
	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0)
	public int FrontID() {
		return this.io.getIntField(this, 0);
	}

	/**
	 * \u01f0\ufffd\u00f1\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(0)
	public CThostFtdcLogoutAllField FrontID(int FrontID) {
		this.io.setIntField(this, 0, FrontID);
		return this;
	}

	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(1)
	public int SessionID() {
		return this.io.getIntField(this, 1);
	}

	/**
	 * \ufffd\u1ef0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(1)
	public CThostFtdcLogoutAllField SessionID(int SessionID) {
		this.io.setIntField(this, 1, SessionID);
		return this;
	}

	/**
	 * \u03f5\u0373\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSystemNameType
	 */
	@Array({ 41 })
	@Field(2)
	public Pointer<Byte> SystemName() {
		return this.io.getPointerField(this, 2);
	}

	public CThostFtdcLogoutAllField() {
		super();
	}

	public CThostFtdcLogoutAllField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
