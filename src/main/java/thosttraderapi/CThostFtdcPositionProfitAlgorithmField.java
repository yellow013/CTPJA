package thosttraderapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u04ef\ufffd\ufffd\ufffd\u3de8<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:2577</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thosttraderapi") 
public class CThostFtdcPositionProfitAlgorithmField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u04ef\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(2) 
	public byte Algorithm() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \u04ef\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(2) 
	public CThostFtdcPositionProfitAlgorithmField Algorithm(byte Algorithm) {
		this.io.setByteField(this, 2, Algorithm);
		return this;
	}
	/**
	 * \ufffd\ufffd\u05e2<br>
	 * C type : TThostFtdcMemoType
	 */
	@Array({161}) 
	@Field(3) 
	public Pointer<Byte > Memo() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcPositionProfitAlgorithmField() {
		super();
	}
	public CThostFtdcPositionProfitAlgorithmField(Pointer pointer) {
		super(pointer);
	}
}