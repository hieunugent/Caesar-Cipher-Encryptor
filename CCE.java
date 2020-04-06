class CCE{
  public static String caesarCypherEncryptor(String str, int key){
    char [] newStrInChar = new char[str.length()];
    int newKeyShift= key % 26;
    for (int i = 0 ; i < str.length() ; i++){
      newStrInChar[i] = getShiftChar(str.charAt(i), newKeyShift);
    }
    return new String(newStrInChar);
  }
  public static char getShiftChar(char ch, int key){
    int newkeycode = key +ch;
    return newkeycode <= 122 ? (char) newkeycode :(char) (96+ newkeycode%122);
  }
}
