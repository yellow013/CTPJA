package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u046f\ufffd\ufffd\ufffd\u043d\ufffd\ufffd\ufffd\ufffd\ufffd\u03f8\ufffd\ufffd\ufffd\ufffdTradeCode=204999<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:260</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcTransferQryDetailReqField extends StructObject {
	/**
	 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\ufffd\u02fb\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 0);
	}
	public CThostFtdcTransferQryDetailReqField() {
		super();
	}
	public CThostFtdcTransferQryDetailReqField(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
}
