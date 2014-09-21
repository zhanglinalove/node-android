package com.iwebpp.node;


public interface Readable extends EventEmitter {
	public Object   read(int size) throws Exception;
	public boolean  setEncoding(String encoding);
	public Readable pause() throws Exception;
	public Readable resume() throws Exception;
	public Writable pipe(Writable dest, boolean end) throws Exception;
	public Readable unpipe(Writable dest) throws Exception;
	public boolean  unshift(Object chunk) throws Exception;
	public boolean  readable();
	public void     readable(boolean readable);
}
