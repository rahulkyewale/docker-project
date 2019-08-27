/**
 * 
 */
package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rahulyewale
 *
 */

@Controller
public class HelloWorldController 
{
	@GetMapping("/helloWorld")
	public ModelAndView helloWorld()
	{
		ModelAndView model = new ModelAndView("helloWorld");
		return model;
	}
}
