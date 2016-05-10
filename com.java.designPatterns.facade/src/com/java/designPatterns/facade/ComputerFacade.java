package com.java.designPatterns.facade;

public class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	public ComputerFacade(){
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startup(){
		System.out.println(" startup this computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println(" start computer finished!");
	}
	
	public void shutdown(){
		System.out.println(" shutdown this computer!");
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
		System.out.println(" computer closed!");
	}
}
