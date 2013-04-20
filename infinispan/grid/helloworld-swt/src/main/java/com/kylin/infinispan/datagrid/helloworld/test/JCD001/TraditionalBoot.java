package com.kylin.infinispan.datagrid.helloworld.test.JCD001;

import java.io.File;
import java.io.IOException;

import com.customized.tools.common.ResourceLoader;

public class TraditionalBoot extends JCD001Base {

	public static void main(String[] args) throws IOException {
		
		ResourceLoader.unRegisterDir(new File("").getAbsolutePath());

		String config = System.getProperty("demo.conf.dir") + File.separator + "infinispan-distribution.xml";
		
		args = new String[]{"-c", config};
		
		com.kylin.infinispan.datagrid.helloworld.Main.main(args);
	}

}
