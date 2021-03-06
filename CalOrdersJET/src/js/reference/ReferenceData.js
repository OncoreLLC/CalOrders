/* 
 * The OnCore Consulting LLC License
 *
 * Copyright 2016 OnCore Consulting LLC, All Rights Reserved.
 *
 * Permission IS NOT GRANTED to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, unless the following conditions are met:
 *
 * Written permission is obtained from  
 * OnCore Consulting LLC and the above copyright 
 * notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

var ReferenceData = new function ()
{

    this.vendors = null;
    this.categories = null;
    this.relatedServices = null;
    this.unitCodes = null;

    /**
     * Fetch the vendors for display in a vendors  drop down list
     * 
     * @returns {Arrays}
     */
    this.getVendors = function ()
    {
        if (this.vendors === null)
        {
            this.vendors = [{label: "", value: ""}];

            var vendorsURL = new ServiceEndPoints().getEndPoint("findAllVendors");

            var parseVendors = function (response)
            {
                ReferenceData.vendors.push({label: response.vndName, value: response.vndUid});
            };

            var Vendor = oj.Model.extend({
                urlRoot: vendorsURL,
                parse: parseVendors,
                id: "vndUid"});
            var Vendors = oj.Collection.extend({
                url: vendorsURL,
                model: new Vendor()});
            var vendorsCollection = new Vendors();

            vendorsCollection.fetch({});
        }

        return this.vendors;
    };

    /**
     * Fetch the categories for display in a categories  drop down list
     * 
     * @returns {Arrays}
     */
    this.getCategories = function ()
    {
        if (this.categories === null)
        {
            this.categories = [{label: "", value: ""}];

            var categoryURL = new ServiceEndPoints().getEndPoint("findAllCategories");

            var parseCategories = function (response)
            {
                ReferenceData.categories.push({label: response.shortDesc, value: response.code});
            };

            var Category = oj.Model.extend({
                urlRoot: categoryURL,
                parse: parseCategories,
                id: "code"});
            var Categories = oj.Collection.extend({
                url: categoryURL,
                model: new Category()});
            var categoriesCollection = new Categories();

            categoriesCollection.fetch({});
        }

        return this.categories;
    };

    /**
     * Fetch the unit codes for display in a unit code drop down list
     * 
     * @returns {Arrays}
     */
    this.getProductUnitCodes = function ()
    {
        if (this.unitCodes === null)
        {
            this.unitCodes = [{label: "", value: ""}];

            var unitCodeURL = new ServiceEndPoints().getEndPoint("findAllUnitCodes");

            var parseUnitCodes = function (response)
            {
                ReferenceData.unitCodes.push({label: response.shortDesc, value: response.code});
            };

            var UnitCode = oj.Model.extend({
                urlRoot: unitCodeURL,
                parse: parseUnitCodes,
                id: "code"});
            var UnitCodes = oj.Collection.extend({
                url: unitCodeURL,
                model: new UnitCode()});
            var unitCodesCollection = new UnitCodes();

            unitCodesCollection.fetch({});
        }

        return this.unitCodes;
    };
};


