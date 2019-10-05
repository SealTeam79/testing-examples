package com.pik.contact.demo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TestChunker {

	public static void main(String[] args) {

		try {

			StringBuilder bigAssString = new StringBuilder(1024*1024*3);
			bigAssString.append("----- start ------");

			String string = "0123456789ABCDEF";
			for (int i = 0; i < ((1024*1024*2)/16); i++) {
				bigAssString.append(string);
			}

			bigAssString.append("----- end ------");

			//System.out.println("bigAssString -->"+ bigAssString);
			//printDetails("bigAssString",bigAssString.toString());


			String lastChunk = getLastChunk(bigAssString.toString(), 100);



			System.out.println("lastchunk -->"+ lastChunk);
			printDetails("chunk",lastChunk);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void printDetails (String msg, String str) throws UnsupportedEncodingException{
		System.out.println(String.format(
				msg +" [...] - Chars: %d - Bytes: %d",
				str.length(), str.getBytes("UTF-8").length));
	}


	public static String getLastChunk(String original, int chunkSize) throws
			UnsupportedEncodingException {
		List<String> strings = new ArrayList<>();
		final int end = original.length();
		int from = 0, to = end;


		from = end - chunkSize < 0 ? 0 : end - chunkSize;
		String chunk = original.substring(from, to); // get chunk
		while (chunk.getBytes(StandardCharsets.UTF_8).length > chunkSize) { // adjust chunk to proper byte size if necessary
			chunk = original.substring(from++, to);
		}

		return chunk;
	}
}
