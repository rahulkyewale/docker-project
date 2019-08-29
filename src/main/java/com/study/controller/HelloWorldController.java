/**
 * 
 */
package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rahulyewale
 *
 */

@Controller
public class HelloWorldController 
{
	@GetMapping("/helloWorld")
	public String helloWorld()
	{
		return "helloWorld";
	}
}
