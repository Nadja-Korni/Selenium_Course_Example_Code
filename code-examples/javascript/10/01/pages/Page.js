class Page {
  constructor(driver) {
    this.driver = driver
  }

  async visit(url) {
    await this.driver.get(url)
  }

  find(locator) {
    return this.driver.findElement(locator)
  }

  async click(locator) {
    await this.find(locator).click()
  }

  async type(locator, inputText) {
    await this.find(locator).sendKeys(inputText)
  }

  async function isDisplayed(locator) {
    return await find(locator).isDisplayed()
  }
}

module.exports = Page