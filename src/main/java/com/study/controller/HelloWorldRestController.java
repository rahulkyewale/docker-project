/**
 * 
 */
package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rahulyewale
 *
 */

@RestController
public class HelloWorldRestController 
{
	@GetMapping("/helloWorldRest")
	public String helloWorld()
	{
		return "!! Hello World REST !!";
	}
}
