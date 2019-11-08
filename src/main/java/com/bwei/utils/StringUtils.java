package com.bwei.utils;

/**
		判断源字符串是否有值，空引号也算没值	String 源字符串	boolean	null = false
		"" = false
		判断源字符串是否有值，空引号和空格也算没值	String 源字符串	boolean	null = false
		"" = false
		" " = false
		判断是否为手机号码	String 源字符串	boolean	null = false
		" " = false
		"13800138000" = true
		"19203604281" = false
 */
public class StringUtils {
	
	/**
     * 判断是否为空字符串最优代码
     * @param str
     * @return 如果为空，则返回true
     */
    public static boolean isEmpty(String str){
        return str == null || str.trim().length() == 0;
    }
    
    
    /**
	 * 功能说明：判断字符串的值是不是数字<br>
	 * @param validString
	 * @return
	 * boolean
	 */
	public static boolean isNumber(String validString){
		if(!hasText(validString)){
			return false;
		}
		byte[] tempbyte = validString.getBytes();
		for(int i = 0; i < validString.length(); i++){
			if (tempbyte[0] == 46) {
				return false;
			}
			if( ( tempbyte[i] == 45 ) && ( i == 0 ) ){
				continue;
			}
			if((tempbyte[i] < 48 && tempbyte[i] != 46) || (tempbyte[i] > 57)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 功能说明：判断字符串是否有值，空白字符串和空格也不算<br>
	 * @param src
	 * @return
	 * boolean
	 */
	public static boolean hasText(String src){
		return src != null && src.trim().length() > 0;
	}
	

	/**
	 * 手机号验证
	 * @param str
	 * @return
	 */
	public static boolean isPhone(String str){
		
		String reg = "1[3|5|6|7|8|9]\\d{9}";
		
		return str.matches(reg);
		
	}
	
	/**
	 * 邮箱验证
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str){
		String reg = "\\w+@\\w+(.com|.cn)";
		return str.matches(reg);
	}
	
}
